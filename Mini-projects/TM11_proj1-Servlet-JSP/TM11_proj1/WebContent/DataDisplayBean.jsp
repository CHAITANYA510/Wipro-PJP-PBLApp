<%@ page import="bean.BidderBean" %>
<%
	BidderBean bidder = (BidderBean)request.getAttribute("displayBidder");
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Project 1</title>
</head>
<body>
	<div style="background-color: yellow; color: black;">
		<h1 style="text-align: center">Bid submitted</h1>
		<h3 style="text-align: center">Your bid is now active.</h3>
		<p style="text-align: center">If your bid is successful, you will be notified within 24 hours of closing of bidding.</p>
		<table border="1" style="margin-left: auto; margin-right: auto;">
			<tr>
				<td colspan="2" style="text-align: center; text-transform: uppercase; background-color: black; color: white;"><%= bidder.getItemname()%></td>
			</tr>
			<tr>
				<td>Item ID</td>
				<td><%= bidder.getItemname()%></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><%= bidder.getName()%></td>
			</tr>
			<tr>
				<td>Email Address</td>
				<td><%= bidder.getEmail()%></td>
			</tr>
			<tr>
				<td>Bid Price</td>
				<td>Rs.<%= bidder.getAmount()%></td>
			</tr>
			<tr>
				<td>Auto-increment price:</td>
				<td><%=bidder.isAutobidders() %></td>
			</tr>
		</table>
	</div>
</body>
</html>