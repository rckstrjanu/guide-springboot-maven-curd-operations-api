# Springboot CURD operations API

This application provides an interface to do the following functionalities.
1. Get Messages
2. Add Messages
3. Update messages

It internally uses a Cache Mechanism (i.e. HashMap ) to store and retrieve the information for performing the curd operations.

One can access the above services with the following REST API Urls.

Usage:

#ADD MESSAGE

URL: localhost:8080/CurdOperation/addMessage
METHOD TYPE: ´POST´

Rest API Body Format:

{
   "id":"1",
   "name":"NAME OR MESSAGE"
}

OUTPUT:

Message : RAJA Added to cache (Map) successfully


#GET MESSAGE

URL: localhost:8080/CurdOperation/getMessage/0
METHOD TYPE: ´GET´


OUTPUT:

NAME OR MESSAGE

#UPDATE MESSAGE

URL: localhost:8080/CurdOperation/updateMessage
METHOD TYPE: ´POST´

Rest API Body Format:

{
   "id":"1",
   "name":"HELLO RCKSTR"
}

OUTPUT:

Update the Value from: NAME OR MESSAGE To: HELLO RCKSTR



@copyright rckstrjanu