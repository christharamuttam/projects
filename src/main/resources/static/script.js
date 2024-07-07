fetch("Item/list")
.then(function(response){
	return response.json();
})
.then(function(list){
  	let placeholder = document.querySelector("#data-output");
	let out = "";
	for(let Items of list){
		out += `
			<tr colspan="7">
				<td style="width:20%"><div style="text-align:center" ><label>${Items.id}</label></div>
                <div style="width:100%;align:center"><img src='${Items.image}' width="300" height="100"> </div></td>
				<td>${Items.title}</td>
				<td>${Items.description}</td>
				<td>${Items.category}</td>
				<td>${Items.otherInfo}</td>
				<td>${Items.date}</td>
                <td><button id="dynamic" style="background-color: #fffafa;width:120px" onClick="CreatewishList('${Items.id}','${Items.title}','${Items.description}','${Items.category}','${Items.otherInfo}','${Items.image}','${Items.date}')">Add to Wish List</button></td>
			</tr>
		`;
	}

	placeholder.innerHTML = out;
});

function Call(a) {

var usr1=localStorage.getItem("username");
const xhr = new XMLHttpRequest();
xhr.open("POST", "wishlist/createWishList");
xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
const body = JSON.stringify({
  user: usr1,
  itemId: a,
  completed: false
});
xhr.onload = () => {
  if (xhr.readyState == 4 && xhr.status == 201) {
    console.log(JSON.parse(xhr.responseText));
    alert("Success :"+xhr.responseText);
  } else {
    console.log(`Error: ${xhr.status}`);
    alert("failed :"+xhr.responseText);
  }
};
xhr.send(body);


}


function CreatewishList(itemId,title,desc,category,otherinfo,image,date1) {



var usr2=sessionStorage.getItem("username");
const xhr = new XMLHttpRequest();
xhr.open("POST", "resultobj/createWishList");
xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
const body = JSON.stringify({userName:usr2,wishlistItemID:itemId,itemTitle:title,itemDescription:desc,itemCategory:category,itemImage:image,itemOtherInfo:otherinfo,itemDate:date1});
xhr.onload = () => {
  if (xhr.readyState == 4 && xhr.status == 200) {
    //console.log(JSON.parse(xhr.responseText));
    if(xhr.responseText=='Success') {
        alert("Selected Item added to Wish list");
    } else{
      alert("Item already available in wish list, please try another item.");
    }

  } else {

    if(xhr.responseText=='Success') {
            alert("Selected Item added to Wish list");
     } else{
          alert("Item already available in wish list, please try another item.");
     }


  }
};
xhr.send(body);


}


//var usr=localStorage.getItem("username");
var usr =sessionStorage.getItem("username");
 usr="Logged in user: "+usr;
 document.getElementById("dvid").innerHTML = usr;


