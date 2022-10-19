let http = require("http");

http.createServer((req, res) =>{
    console.log("Web Server started at port: 8000");
    res.writeHead(200, {"Content-type" : "text/htmll; charset=utf-8"})
    res.end("Hello World!");
}).listen(8000);
