<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
 crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">UserManagement</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
 
         <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/Registration">Registration</a>
        </li>
       
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/">Login</a>
        </li>
       
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/Logout">Logout</a>
        </li>
       
  
    </div>
  </div>
</nav>

<section>
	<div class="container p-3" style="margin-top: 100px">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header text-center fs-4">Login page</div>
						<div class="card-body">
							<form action="/Login" method="get">
							<div class="mb-3">
							<label for="Username">Username:</label>
        					<input type="text" id="Username" name="Username" required  class="form-control">
        					</div>

		<div>
	        <label for="password">Password:</label>
	        <input type="password" id="password" name="password" required  class="form-control"><br>
		</div>
	
	        <button class="btn btn-primary col-md-12">Login</button>
			</form>
		</div>
</div>
</div>
</div>
</div></section>
</body>
</html>