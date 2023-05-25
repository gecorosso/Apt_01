
<html>
<head>
    <title>prodotti.ftl</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* CSS personalizzato */
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .jumbotron {
            background-color: #ffffff;
            padding: 2rem;
            margin-top: 2rem;
            border-radius: 0.5rem;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333333;
            font-size: 2.5rem;
        }
        p {
            color: red;
            font-size: 1.2rem;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="jumbotron">
            <h1>My catalogo Boot</h1>
            <p>Fantastica Prodotti</p>
        </div>
    </div>
    <br><br>
    
    
    <table align="Center" border=1>
    	<thead>
    		<tr>
    			<td>NOME</td>
    			<td>DESCRIZIONE</td>
    			<td>PREZZO</td>
    		</tr>
    	</thead>
    	<tbody>
    		<#list listaProdotti as prodotto>
    		<tr>
    			<td>${prodotto.nome}</td>
    			<td>${prodotto.descrizione}</td>
    			<td>${prodotto.prezzo}</td>
    		</tr>
    		</#list>
    	</tbody>
    	
    </table>
    
    
    
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
