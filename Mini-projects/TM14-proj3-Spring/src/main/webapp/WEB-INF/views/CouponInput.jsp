<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter coupon details</title>
	<style>
		body{
				background-color: #6bc7c7;
			}
		div{
				text-align: center;
				font-size: 20px;
			}
	</style>
</head>
<body>
	<div>
    <h1>Your current balance is ${balance }</h1>
    <h2 style="color: green;">Claim your cash back!!</h2>
    <h2 style="color: red;">${message }</h2>
    	<form name="CouponInput" action="CouponInput" method="post">
                Enter Coupon code <input type="text" id="couponCode" name="couponCode" required> <br>
                     <input type="submit" value="Claim">
                     <input type="reset">
        </form>                        
    </div>
</body>
</html>