--Select
SELECT ContactName Adı,CompanyName ŞirketAdı,City Şehir FROM Customers

SELECT * FROM Customers WHERE City = 'Berlin'

--case insensitive
SELECT * FROM Products WHERE CategoryID = 1 or CategoryID = 3

SELECT * FROM Products WHERE CategoryID = 1 and UnitPrice >= 10

SELECT * FROM Products WHERE CategoryID = 1 ORDER BY UnitPrice DESC --ascending --descending

SELECT COUNT(*) FROM Products

SELECT COUNT(*) Adet FROM Products WHERE CategoryID = 2

SELECT CategoryID, COUNT (*) FROM Products WHERE UnitPrice>20 GROUP BY CategoryID HAVING count(*)<10

SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
FROM  Products
INNER JOIN Categories
ON Products.CategoryID = Categories.CategoryID
WHERE Products.UnitPrice>10

--DTO Data Transformation Object

SELECT * FROM Products p LEFT JOIN [Order Details] od
on p.ProductID = od.ProductID

SELECT * FROM Customers c LEFT JOIN Orders o
on c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL
