var http = require('http');
var url = require('url');
var fs = require('fs');

http.createServer(function (req, res) {
  var q = url.parse(req.url, true);
  var filename = "." + q.pathname;
  fs.readFile(filename, function(err, data) {
    if (err) {
      res.writeHead(404, {'Content-Type': 'text/html'});
      return res.end("404 Not Found");
    } 
    res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
    res.write(data);
    return res.end();
  });
}).listen(8080); 

// The HTTP module can create an HTTP server that listens to server ports and gives a response back to the client.
// The URL module splits up a web address into readable parts.
// To include the File System module, use the require() method