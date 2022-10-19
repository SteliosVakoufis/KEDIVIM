var express = require('express');

var app = express();

app.use('/', (req, res) => {
	res.send('Hello World');
});

app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});

// A common task for a web server can be to open a file on the server and return the content to the client.

// Here is how PHP or ASP handles a file request:

//     Sends the task to the computer's file system.
//     Waits while the file system opens and reads the file.
//     Returns the content to the client.
//     Ready to handle the next request.

// Here is how Node.js handles a file request:

//     Sends the task to the computer's file system.
//     Ready to handle the next request.
//     When the file system has opened and read the file, the server returns the content to the client.

// Node.js eliminates the waiting, and simply continues with the next request.

// Node.js runs single-threaded, non-blocking, asynchronous programming, which is very memory efficient.