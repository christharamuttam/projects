fetch("resultobj/getWishlist/"+sessionStorage.getItem("username"))
.then(function(response){
	return response.json();
})
.then(function(list){
	let placeholder = document.querySelector("#data-output1");
	let out = "";
	for(let Items of list){
		out += `
                    <tr colspan="7">
        				<td style="width:20%"><div style="text-align:center" ><label >${Items.wishlistItemID}</label></div>
                        <div style="width:100%;align:center"><img src='${Items.itemImage}' width="300" height="100"> </div></td>
        				<td>${Items.itemTitle}</td>
        				<td>${Items.itemDescription}</td>
        				<td>${Items.itemCategory}</td>
        				<td>${Items.itemOtherInfo}</td>
        				<td>${Items.itemDate}</td>
                        <td><button id="dynamic" style="background-color: #fffafa;width:150px" onClick="RemoveWishList('${Items.wishlistID}')">Remove from Wish List</button></td>
        			</tr>
		`;
	}

	placeholder.innerHTML = out;
});

function Call(a) {

var usr1=localStorage.getItem("username");
alert("here11111"+usr1);
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
    alert("Sucess :"+xhr.responseText);
  } else {
    console.log(`Error: ${xhr.status}`);
    alert("failed :"+xhr.responseText);
  }
};
xhr.send(body);


}


function RemoveWishList(wishlistid) {


const xhr = new XMLHttpRequest();
xhr.open("DELETE", "resultobj/removeWishlist/"+wishlistid,true);
xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
//const body = JSON.stringify({wishlistID:wishlistid});
xhr.onreadystatechange = function () {
  if (xhr.readyState == 4 && xhr.status == 200) {
    //console.log(JSON.parse(xhr.responseText));
    window.location.href = "mywishlist.html";
   }
};
xhr.send();
alert("Selected Item removed from Wish list");

}


var usr=sessionStorage.getItem("username");
usr="Logged in user: "+usr;
document.getElementById("dvid").innerHTML = usr;


$(document).ready(function(){
    $("select.item").change(function(){
        var selectedCategory = $(this).children("option:selected").val();
        alert("You have selected category- " + selectedCategory);
        var usrName=sessionStorage.getItem("username");
        var url="resultobj/getWishlist/"+usrName;
        if(selectedCategory!=null && selectedCategory=='All') {
          url="resultobj/getWishlist/"+usrName;
        } else{
           url="resultobj/getWishlist/"+usrName+"/"+selectedCategory;
        }

        fetch(url)
        .then(function(response){
        	return response.json();
        })
        .then(function(list){
          	let placeholder = document.querySelector("#data-output1");
        	let out = "";
        	for(let Items of list){
        		out += `
        			<tr colspan="7">
        				<td style="width:20%"><div style="text-align:center" ><label >${Items.wishlistItemID}</label></div>
                          <div style="width:100%;align:center"><img src='${Items.itemImage}' width="300" height="100"> </div></td>
        				<td>${Items.itemTitle}</td>
        				<td>${Items.itemDescription}</td>
        				<td>${Items.itemCategory}</td>
        				<td>${Items.itemOtherInfo}</td>
        				<td>${Items.itemDate}</td>
                        <td><button id="dynamic" style="background-color: #fffafa;width:150px" onClick="RemoveWishList('${Items.wishlistID}')">Remove from Wish List</button></td>
        			</tr>
        		`;
        	}

        	placeholder.innerHTML = out;
        });


    });
});


function RemoveMe(){
var usrName=sessionStorage.getItem("username");
var url1=url="resultobj/removeAllWishlist/"+usrName;
var check = confirm("Are you sure you want to remove wish list?");
 if (check == true) {
    const xhr = new XMLHttpRequest();
    xhr.open("DELETE", url1,true);
    xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");

    xhr.onreadystatechange = function () {
      if (xhr.readyState == 4 && xhr.status == 200) {
        //console.log(JSON.parse(xhr.responseText));
        window.location.href = "mywishlist.html";
       }
    };
    xhr.send();
    alert("wish list successfully removed");
}
}