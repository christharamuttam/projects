1. API Docs : http://localhost:8080/v2/api-docs
2. User details for application login
application URL : http://localhost:8080/login.html
  Sample user/pwd details
   1. myusername@gmail.com/mypassword
   2. myusername1@gmail.com/mypassword1
   3. myusername2@gmail.com/mypassword2
   4. myusername3@gmail.com/mypassword3


   API : http://localhost:8080/user/createUser
   {
   "email":"myusername@gmail.com",
   "password":"password"
   }

   Verify User
   http://localhost:8080/user/login/myusername

3. Source Code location on git : https://github.com/christharamuttam/projects/tree/master

4. Create Items/Products
API URL : http://localhost:8080/Item/create
{
"title":"Kings Park Hotel",
"description":"best accommodation and service,From £40 per person per night",
"category":"Accommodation",
"image":"img/IMGACC2.jpeg",
"date":"NA",
"otherInfo":"Whether you visit for a Scottish break, golfing holiday or business trip, here you can treat yourself to the best accommodation and service, only minutes from Glasgow city centre and East Kilbride"
}

{
"title":"Braeburn Cottage , By Balloch",
"description":"Stay in our cottage,From £30 per person per night",
"category":"Accommodation",
"image":"img/IMGACC3.jpg",
"date":"NA",
"otherInfo":"Welcome to Braeburn Cottage, Welcome you to have a relaxing stay in our cottage, home baking on arrival and free range eggs with your breakfast , enjoy a full Scottish breakfast or continental or vegetarian we cater for everyone"
}

{
"title":"Carmichael cottages- Bigger",
"description":"From £280 per unit per week",
"category":"Accommodation",
"image":"img/IMGACC4.jpeg",
"date":"NA",
"otherInfo":"Carmichael cottages offer you a warm welcome and a chance to recharge your batteries in the peace and quiet of the countryside."
}
{
"title":"Auchendennan Courtyard",
"description":"From £295 per unit per week",
"category":"Accommodation",
"image":"img/IMGACC5.jpeg",
"date":"NA",
"otherInfo":"Perfect for short stays in Loch Lomond of 2 nights or more. Situated within the main farm courtyard on Auchendennan farm private estate. Within easy reach of the Cruin, Duck Bay, Cameron house and the youth hostel."
}


{
"title":"SCOTTISH PREMIERSHIP: CELTIC VS RANGERS",
"description":"Celtic take on Rangers in this Scottish Premiership fixture",
"category":"Event",
"image":"img/IMGEVT1.jpeg",
"date":"31 Aug 2024",
"otherInfo":"31 Aug 2024, 15 Mar 2025 @ 3pm-4:45pm. Opening times are a guide only and may change on a daily basis. Please contact the business directly."
}

{
"title":"BIG FUN: BOOK BUB",
"description":"Discover the world of Big Fun this summer at Queens Park Arena.",
"category":"Event",
"image":"img/IMGEVT2.jpeg",
"date":"19 Jul 2024",
"otherInfo":"12, 19 Jul 2024 @ 11:45am-12:30pm. Opening times are a guide only and may change on a daily basis. Please contact the business directly."
}


{
"title":"CLAN MACMILLAN",
"description":"MacMillan is a clan with an ancient royal heritage.",
"category":"Attractions",
"image":"img/IMGATTR1.jpeg",
"date":"NA",
"otherInfo":"MacMillan is a clan with an ancient royal heritage - one 12th century chief was a descendent of Macbeth, King of Scotland and inspiration to Shakespeare."
}

{
"title":"CLYDE VALLEY PICTURE FRAMING",
"description":"Selection of original artwork, prints and handmade gifts.",
"category":"Attractions",
"image":"img/IMGATTR2.jpeg",
"date":"NA",
"otherInfo":"Clyde Valley Picture Framing sells a selection of original artwork, prints and handmade gifts from a selection of local artists, I also offer a full picture framing service."
}

{
"title":"ICEFIRE GLASS",
"description":"Ornamental glassware designers and makers.A glass studio and gallery.",
"category":"Attractions",
"image":"img/IMGATTR3.jpeg",
"date":"NA",
"otherInfo":"A glass studio and gallery open to the public, where you can see us working almost every day.We make pieces based on fantasy, heraldic, Scottish themes, and wildlife subjects, which are on display."
}

