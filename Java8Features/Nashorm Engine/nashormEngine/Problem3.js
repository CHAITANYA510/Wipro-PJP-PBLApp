/**
 * Write a JavaScript code which creates a Java HashMap object, store 5 country and capital names as key and value pair,
 * Iterate them with for loop and display the elements one by one.
 */

var pack1 = Java.type("java.util.HashMap");
var pack2 = Java.type("java.util.Iterator");
var pack3 = Java.type("java.util.Map");
var pack4 = Java.type("java.util.Map.Entry");
var pack5 = Java.type("java.util.Set");

var map = new pack1();
map.put("India","Delhi");
map.put("China","Bejing");
map.put("UK","London");
map.put("USA","Washington DC");
map.put("Pakistan","Karachi");

print("Original HashMap : "+map);
print("HashMap using iterator in js: ");

var s1 = map.entrySet();
var itr = s1.iterator();

while(itr.hasNext()) {
	var m1 = itr.next();
	print(m1.getKey()+" - "+m1.getValue());
}
