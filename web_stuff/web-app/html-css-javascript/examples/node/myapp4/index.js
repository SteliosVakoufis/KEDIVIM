var express = require('express');

var app = express();

var logger = (req, res, next) => {
	
		var url = req.url;
		var time = new Date();
		console.log('Received request for ' + url + ' at' + time);
		
		next();
	};

app.use('/public', logger, (req, res) => {
	console.log('public page');
	res.send('This is the public');
});

app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});
