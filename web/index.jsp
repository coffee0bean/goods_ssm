<!DOCTYPE html>
<html>
  <head>
    <title>$Title$</title>
    <style>
      a{
        text-decoration: none;
      }
    </style>
  </head>
  <body>
  <center>
  <table  id="app"  border="1px" cellspacing="0" cellpadding="0">
    <tr>
      <td>ID</td>
      <td>SORT</td>
      <td>NAME</td>
      <td>ADDRESS</td>
      <td>PRICE</td>
      <td>CREATEDATE</td>
      <td>REMAINING</td>
      <td>OPTION</td>
    </tr>
    <tr v-for="detail in details">
      <td>{{detail.id}}</td>
      <td>{{detail.sortName}}</td>
      <td>{{detail.name}}</td>
      <td>{{detail.address}}</td>
      <td>{{detail.price}}</td>
      <td>{{detail.createDate}}</td>
      <td>{{detail.remaining}}</td>
      <td><a @click="buy(detail.id)">Buy</a><input type="button" value="Buy" @click="buy"/></td>
    </tr>
  </table>
  </center>
  <script src="statics/js/vue.js"></script>
  <script src="statics/js/jquery-1.8.3.min.js"></script>
  <script src="statics/js/index.js"></script>
  </body>
</html>
