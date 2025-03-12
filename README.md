Walmart CA Catalog Tools Web Application. This API supports:

Adding a New Product
Updating an Existing Product
Changing Product Price
Updating Stock Levels
Modifying Product Attributes

Access the H2 Database at:
http://localhost:8084/h2-console

JDBC URL: jdbc:h2:mem:currencydb
Username: sa
Password: 
Test API with Postman for Currency:
================================== 

POST /api/currency/convert
{
"baseCurrency": "USD",
"targetCurrency": "EUR",
"amount": 100
}


Test API with Postman for Product Catalog:
========================================= 

http://localhost:8084/api/products

Add a New Product
URL: POST http://localhost:8084/api/products
Request Body:
{
"sku": "SKU12345",
"name": "Samsung Galaxy S24",
"price": 999.99,
"stock": 50,
"attributes": {
"brand": "Samsung",
"color": "Black",
"storage": "256GB"
}
}

Update Product Price
URL: PATCH http://localhost:8084/api/products/price
{
"sku": "SKU12345",
"newPrice": 899.99
}
✅ Expected Response:
(No content, but stock updates in DB)

Update Stock Quantity
PATCH http://localhost:8084/api/products/stock
Request Body:
{
"sku": "SKU12345",
"newStock": 100
}
✅ Expected Response:
(No content, but stock updates in DB)

Update Product Attributes
PATCH http://localhost:8084/api/products/attributes
{
"sku": "SKU12345",
"updatedAttributes": {
"color": "Blue",
"warranty": "2 Years"
}
}
✅ Expected Response:
(No content, but attributes update in DB)




