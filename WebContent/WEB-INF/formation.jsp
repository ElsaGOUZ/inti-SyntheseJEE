<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.css" />
<title>Les formations</title>
</head>
<h2>LISTE DES FORMATIONS</h2>
<body>
<form action="ServletFormation">
		<section class="container">
			<h1>FORMULAIRE</h1>
			<div class="form-group">
			<input type="text" class="form-control"
				placeholder="Saisir votre nom" type="text" name="nom" value="${nom}"
				required> <br> 
				<input type="text" class="form-control"
				placeholder="Saisir votre Prenom" type="text" name="prenom"
				value="${prenom}" required> <br> <input type="number"
				class="form-control" placeholder="Saisir votre Age" type="number"
				name="age" value="${age}" required> <br>
			</div>
			<div class="form-group form-check">
				<button type="submit" name="ajouter" class="btn btn-primary">Ajouter</button>
			</div>
		</section>
		<div class="container">
			<table class="table">
				<thead class="thead-light">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">FORMATION</th>	
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td>1</td>
						<td>JEE</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>2</td>
						<td>COBOL</td>
					</tr>
					<tr>
						<th scope="row">3</th>
						<td>3</td>
						<td>PYTHON</td>
						
					</tr>
				<tbody>
					<c:if test="${!empty formations}">
						<c:forEach items="${formations}" var="x">
							<tr>
								<td><c:out value="${x.id}" /></td>
								<td><c:out value="${x.nomFromation}" /></td>
								<td><a href="AjouterFormation?id=${x.id}">Ajouter</a></td>
								<td><a href="SupprimerFormation?id=${x.id}">supprimer</a></td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
				</tbody>
			</table>
		</div>
	</form>
</body>
</html>