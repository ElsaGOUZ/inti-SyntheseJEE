<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.css">
<title>La Liste des stagiaires</title>
</head>
<h2>LISTE DES STAGIAIRES</h2>
<body>
	<form action="ServletStagiaire">
		<section class="container">
		<div class="form-group">
			<input type="text" class="form-control"
				placeholder="Saisir votre Nom" type="text" name="nom" value="${nom}"
				required> <br> <input type="text" class="form-control"
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
						<th scope="col">NOM</th>
						<th scope="col">PRENOM</th>
						<th scope="col">AGE</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${!empty stagiaires}">
						<c:forEach items="${stagiaires}" var="x">
							<tr>
								<td><c:out value="${x.id}" /></td>
								<td><c:out value="${x.nom}" /></td>
								<td><c:out value="${x.prenom}" /></td>
								<td><c:out value="${x.age}" /></td>
								<td><a href="AjouterStagiaire?id=${x.id}">Ajouter</a></td>
								<td><a href="SupprimerStagiaire?id=${x.id}">supprimer</a></td>
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