
<html>
<head>
    <title>Index.ftl</title>
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
            <h1>My catalogo Prodotti</h1>
            
            	<b>...Form di aggiunta</b>            
	            <h2>Nuovo Prodotto</h2>
	            <div style="margin:20px;">
	            	<form method="POST"  action="add" id="datiProdotto">
	            		<div>
	            			<label for="nome">nome</label>
	            			<input type="text" name="nome" id="nome" value=""/>
	            		</div>
	            		
	            		<div>
	            			<label for="descrizione">descrizione</label>
	            			<input type="text" name="descrizione" id="descrizione" value=""/>
	            		</div>
	            		
	            		<div>
	            			<label for="prezzo">prezzo</label>
	            			<input type="text" name="prezzo" id="prezzo" value=""/>
	            		</div>
	            		<div>
	            			<input type="SUBMIT" name="INVIA" value="Aggiungi"/>
	            		</div>	            		
	            	</form>
	            </div>
            
            </br>
            </br>
            
            <h2>Lista Prodotti</h2>
            <div>
              Tabella dei prodotti
              <table border=1>
              	<thead>
              		<tr>
              			<th>NOME</th>
              			<th>DESCRIZIONE</th>
              			<th>PREZZO</th>	
              			<th>AZIONI</th>	
              		</tr>
              	</thead>
              	<tbody>
              		<#list listaProdotti as p>
	              		<tr>
	              			<td>${p.nome}</td>
	              			<td>${p.descrizione}</td>
	              			<td>${p.prezzo}</td>
	              			<td>
	              				<a href="delete?id=${p.id}">ELIMINA</a>&nbsp;
	              				<a href="update?id=${p.id}">MODIFICA</a> 
	              			</td>
	              		</tr>
              		</#list>
              	</tbody>
              	
              </table>  
             
              
              
            </div>
        
            
        
        </div>
    </div>
    
    
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
