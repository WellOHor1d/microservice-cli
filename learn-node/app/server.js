/**
 * Created by XY on 2017/8/30.
 */
'use strict';

let http = require('http');

http.createServer(function (request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    
    response.end('hello world\n');
}).listen(8089);

console.log('the server running at host 8090');


var s = 'Hello';

function greet(name) {
    console.log(s + ', ' + name + '!');
}

module.exports = greet;

exports = greet;

