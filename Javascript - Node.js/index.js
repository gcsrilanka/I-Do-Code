const express = require('express');
const path = require('path');

/**
 * @description Initialize Express
 * @type {*|Function}
 */
const app = express();

/**
 * @description Load view engine and static assets
 */
app.set("views", path.join(__dirname, "views"));
app.use(express.static(path.join(__dirname, "public"))); // Load static assets

/**
 *
 * GET /
 *
 * Visibility: Private
 *
 * @description Renders homepage
 *
 * @param   {String}        Endpoint URL
 * @param   {Function}      Callback function for Request, Response objects
 */
app.get("/", (req, res) => {
    res.status(200).json({message: "Hello World"});
});

/**
 * @description Starts the server
 */
app.listen(process.env.PORT || 7700, () => {
    console.log('Server up and running...');
});