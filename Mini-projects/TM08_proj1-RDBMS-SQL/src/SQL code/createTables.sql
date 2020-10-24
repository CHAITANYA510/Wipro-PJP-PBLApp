--Create TBL_STOCK 

CREATE TABLE TBL_STOCK (

    Product_ID VARCHAR2(6), 
    Product_Name VARCHAR2(20) UNIQUE,
    Quantity_On_Hand int CHECK (Quantity_On_Hand >= 0),
    Product_Unit_Price int CHECK (Product_Unit_Price >= 0),
    Recorder_Level int CHECK (Recorder_Level >= 0),
   
    PRIMARY KEY(Product_ID)
); 

---Create TBL_SALES

CREATE TABLE TBL_SALES (

    Sales_ID VARCHAR2(6), 
    Sales_Date DATE,
    Product_ID VARCHAR2(6),
    Quantity_Sold int CHECK (Quantity_Sold >= 0),
    Sales_Price_Per_Unit int CHECK (Sales_Price_Per_Unit >=0),
   
    PRIMARY KEY(Sales_ID),
    FOREIGN KEY(Product_ID)
    REFERENCES TBL_STOCK(Product_ID)
); 

--INSERT DATA INTO TBL_STOCK 

INSERT INTO TBL_STOCK VALUES('RE1001','REDMI NOTE 3',20,12000,5);
INSERT INTO TBL_STOCK VALUES('IP1002','IPHONE 5S',10,21000,2);
INSERT INTO TBL_STOCK VALUES('PA1003','Panasoic P55',50,5500,5);