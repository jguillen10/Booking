<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
<style type="text/css">
		body {
			font-family: sans-serif;
		}
		.data, .data td {
			border-collapse: collapse;
			width: 100%;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px;
		}
		.data th {
			font-weight: bold;
			background-color: #5C82FF;
			color: white;
		}
	</style>
</head>
 
<body>
   <table width="100%">
       <tr>
           <td colspan="2"><tiles:insertAttribute name="header" /></td>
       </tr>
       <tr>
           <td width="20%" nowrap="nowrap"><tiles:insertAttribute name="menu" /></td>
           <td width="80%"><tiles:insertAttribute name="body" /></td>
       </tr>
       <tr>
           <td colspan="2"><tiles:insertAttribute name="footer" /></td>
       </tr>
   </table>
</body>
</html>