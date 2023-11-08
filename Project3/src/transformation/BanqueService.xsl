<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<html>
			<head >
				<title>Liste des comptes</title>
			</head>
			<body>
				<table border="1">
					<tr>
						<th>Code</th>
						<th>solde</th>
						<th>date</th>
					</tr>
					<!-- <xsl:apply-templates select="BanqueService/getComptes"/> -->
					<xsl:apply-templates select="BanqueService/getComptes[date(substring(date, 1, 4)) > 2000]"/>
				</table>
				<p>Total Solde : <xsl:value-of select="$totalSolde"/></p>
			</body>
		</html>
	</xsl:template>
	<xsl:template match="getComptes">
		<tr>
			<td><xsl:value-of select="code"/></td>
			<td><xsl:value-of select="solde"/></td>
			<td><xsl:value-of select="date"/></td>
		</tr>
	</xsl:template>
</xsl:stylesheet>