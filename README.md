1. API Docs : http://localhost:8080/v2/api-docs
2. User details for application login
application URL : http://localhost:8080/login.html
  Sample user/pwd details
   1. myusername@gmail.com/mypassword
  

   API : http://localhost:8080/user/createUser
   {
   "email":"myusername@gmail.com",
   "password":"mypassword"
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


5. GetWishlist by User and category

http://localhost:8080/resultobj/getWishlist/myusername@gmail.com
http://localhost:8080/resultobj/getWishlist/myusername@gmail.com/Attractions
6. Remove Wishlist Item
http://localhost:8080/resultobj/removeWishlist/100

7. Remove wishlist for the user
http://localhost:8080/resultobj/removeAllWishlist/myusername@gmail.com
