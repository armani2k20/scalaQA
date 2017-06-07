//Using java.util.TimeZone.getAvailableIDs write a single line of code that returns a data set


java.util.TimeZone.getAvailableIDs.filter(x1 => x1.contains("/")).map(x2 => x2.split('/')last).grouped(10).map(x3 => x3.head).toArray
