var express = require('express');

var app = express();


// app.use('/', (req, res) => {
	
// 	res.status(200).type('html');
	
// 	if (req.url=='/about')
// 		res.write('This is the about page');
// 	else if (req.url=='/login')
// 		res.send('This is the login page');
// 	else
// 		res.write('Hello World');
// 	res.end();
// });

app.use('/about', (req, res) => {
	console.log('about page');
	res.send('This is the about page');
});

app.use('/login', (req, res) => {
	console.log('login page');
	res.send('This is the login page');
});

app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});
