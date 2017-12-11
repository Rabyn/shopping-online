<div class="container">
	<div class="row">
		<!-- Sidebar -->
		<div class="col-md-3">
			<%@ include file="./shared/sidebar.jsp"%>
		</div>
		<!--  Products -->
		<div class="col-md-9">
			<!--  breadcrumb -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contetRoot}/home">Home</li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contetRoot}/home">Home</li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>