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
Test API with Postman:

POST /api/currency/convert
{
"baseCurrency": "USD",
"targetCurrency": "EUR",
"amount": 100
}




