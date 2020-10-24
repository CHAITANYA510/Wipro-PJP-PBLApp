---CREATE SEQUENCE SEQ_SALES_ID
CREATE SEQUENCE SEQ_SALES_ID
    INCREMENT BY 1
    START WITH 1000;

--CREATE SEQUENCE SEQ_PRODUCT_ID
CREATE SEQUENCE SEQ_PRODUCT_ID
    INCREMENT BY 1
    START WITH 1004;

---create view
CREATE OR REPLACE VIEW V_SALES_REPORT AS
    SELECT (TBL_SALES.Sales_ID,TBL_SALES.Sales_Date,TBL_SALES.Product_ID,TBL_STOCK.Product_Name, 
    TBL_SALES.Quantity_Sold,TBL_STOCK.Product_Unit_Price,TBL_SALES.Sales_Price_Per_Unit,TBL_SALES.Sales_Price_Per_Unit-TBL_STOCK.Product_Unit_Price AS "Profit_Amount"
    FROM TBL_SALES)
    INNER JOIN TBL_STOCK ON TBL_STOCK.product_id = TBL_SALES.product_id
    ORDER BY Profit_Amount desc,tbl_sales.sales_id ASC;