Access the H2 Database at:
http://localhost:8084/h2-console

JDBC URL: jdbc:h2:mem:currencydb
Username: sa
Password: password
Test API with Postman:

POST /api/currency/convert
{
"baseCurrency": "USD",
"targetCurrency": "EUR",
"amount": 100
}




