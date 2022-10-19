var http = require('http');
// var dt = require('./myfirstmodule');

http.createServer(function (req, res) {
  console.log("Web Server started at port 8080");
  res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
  // res.write("The date and time are currently: " + dt.myDateTime());
  res.end('Hello World!');
}).listen(8080); 