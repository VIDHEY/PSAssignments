const express = require('express');
const app = express();
const path = require('path');
const moment = require('moment');
const exphbs = require('express-handlebars');
const { months } = require('moment');

const publicPath = path.join(__dirname, './public');

app.use(express.json());
app.engine('handlebars', exphbs());
app.set('view engine', 'handlebars');

app.use(express.static(publicPath));


app.get('/', (req, res) => {
  res.render('index');
});

app.get('/addNDays', (req, res) => {
  if (req.query.date) {
    var ipDate = req.query.date;
    var days = req.query.numOfDays;
    var new_date = moment(ipDate, "YYYY-MM-DD").add(days, 'days');

    result = new_date.format('DD');
    result += '-' + new_date.format('MM');
    result += '-' + new_date.format('YYYY');
    res.render('addNDays', {
      result
    });
  }
  else
    res.render('addNDays');
});

app.get('/addNMonths', (req, res) => {
  if (req.query.date) {
    var ipDate = req.query.date;
    var months = req.query.numOfMonths;
    var new_date = moment(ipDate, "YYYY-MM-DD").add(months, 'months');

    result = new_date.format('DD');
    result += '-' + new_date.format('MM');
    result += '-' + new_date.format('YYYY');
    res.render('addNMonths', {
      result
    });
  }
  else
    res.render('addNMonths');
});

app.get('/addNWeeks', (req, res) => {
  if (req.query.date) {
    var ipDate = req.query.date;
    var weeks = req.query.numOfWeeks;
    var new_date = moment(ipDate, "YYYY-MM-DD").add(weeks, 'w');

    result = new_date.format('DD');
    result += '-' + new_date.format('MM');
    result += '-' + new_date.format('YYYY');
    res.render('addNWeeks', {
      result
    });
  }
  else
    res.render('addNWeeks');
});

app.get('/subtractNDays', (req, res) => {
  if (req.query.date) {
    var ipDate = req.query.date;
    var days = req.query.numOfDays;
    var new_date = moment(ipDate, "YYYY-MM-DD").subtract(days, 'days');

    result = new_date.format('DD');
    result += '-' + new_date.format('MM');
    result += '-' + new_date.format('YYYY');
    res.render('subtractNDays', {
      result
    });
  }
  else
    res.render('subtractNDays');
});

app.get('/subtractNMonths', (req, res) => {
  if (req.query.date) {
    var ipDate = req.query.date;
    var months = req.query.numOfMonths;
    var new_date = moment(ipDate, "YYYY-MM-DD").subtract(months, 'months');

    result = new_date.format('DD');
    result += '-' + new_date.format('MM');
    result += '-' + new_date.format('YYYY');
    res.render('subtractNMonths', {
      result
    });
  }
  else
    res.render('subtractNMonths');
});

app.get('/subtractNWeeks', (req, res) => {
  if (req.query.date) {
    var ipDate = req.query.date;
    var weeks = req.query.numOfWeeks;
    var new_date = moment(ipDate, "YYYY-MM-DD").subtract(weeks, 'w');

    result = new_date.format('DD');
    result += '-' + new_date.format('MM');
    result += '-' + new_date.format('YYYY');
    res.render('subtractNWeeks', {
      result
    });
  }
  else
    res.render('subtractNWeeks');
});

app.get('/dayOfWeek', (req, res) => {
  if (req.query.date) {
    var ipDate = req.query.date;
    var result = moment(ipDate, "YYYY-MM-DD").format('dddd');

    res.render('dayOfWeek', {
      result
    });
  }
  else
    res.render('dayOfWeek');
});


app.get('/weeknumOfYear', (req, res) => {
  if (req.query.date) {
    var ipDate = req.query.date;
    var result = moment(ipDate, "YYYY-MM-DD").format('w');
    
    res.render('weeknumOfYear', {
      result
    });
  }
  else
    res.render('weeknumOfYear');
});

// Listen to the App Engine-specified port, or 8080 otherwise
const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
  console.log(`Server listening on port ${PORT}...`);
});

