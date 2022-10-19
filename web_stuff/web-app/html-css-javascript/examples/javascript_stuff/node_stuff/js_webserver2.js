let http = require("http");
let url = require("url");
let dt = require("./myModule").myDateTime;

http.createServer((req, res) => {
    console.log("Web Server started at port: 8000");
    res.writeHead(200, {"Content-type" : "text/htmll; charset=utf-8"})
    let q = url.parse(req.url, true);

    let qstring = q.query;
    let txt = `${qstring.year} ${qstring.month}`;
    res.write("The date is: " + dt());
;    res.end(`
        Host ${q.host}
        Pathname ${q.pathname}
        Search ${q.search}
        txt ${txt}`
    );
}).listen(8000);
