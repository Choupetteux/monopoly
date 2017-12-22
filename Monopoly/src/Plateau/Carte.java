package Plateau;

import java.sql.*;

public class Carte {

	private int typeChance;
	private int typeCC;

	private static void affiche(String message) {
		System.out.println(message);
	}

	private static void affiche2(String message) {
		System.out.println(message);
	}

	private static void arret(String message) {
		System.err.println(message);
		System.exit(99);
	}

	public static void main(String[] args) {
		Connection connection = null;
		ResultSet resultats = null;
		String requete = "";
		String requete2 = "";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			arret("Impossible de charger le pilote jdbc:odbc");
		}

		affiche("connection a la base de donnees");
		try {

			connection = DriverManager.getConnection("jdbc:oracle:thin:@bd11:1521:bd11", "ucar0001", "ucar0001");
		} catch (SQLException e) {
			arret("Connection à la base de donnees impossible");
		}

		affiche("creation et execution de la requete");
		requete = "SELECT * FROM CARTECHANCE ";
		try {
			Statement stmt = connection.createStatement();
			resultats = stmt.executeQuery(requete);

		} catch (SQLException e) {
			arret("Problème lors de l'execution de la requete ");
		}

		affiche("parcours des données");
		try {
			ResultSetMetaData rsmd = resultats.getMetaData();
			int nbOls = rsmd.getColumnCount();
			boolean parcours = resultats.next();

			while (parcours) {

				for (int i = 1; i <= nbOls; i++)
					System.out.println(resultats.getString(i) + "");
				System.out.println();
				parcours = resultats.next();
			}

			resultats.close();
		} catch (SQLException e) {
			arret(e.getMessage());
		}

		affiche2("creation et execution de la requete");
		requete2 = "SELECT * FROM CARTECOMMUNAUTE";
		try {
			Statement stmt = connection.createStatement();
			resultats = stmt.executeQuery(requete2);
		} catch (SQLException e) {
			arret("Problème lors de l'execution de la requete ");
		}
		
		affiche2("parcours des données");
		try {
			ResultSetMetaData rsmd = resultats.getMetaData();
			int nbOls = rsmd.getColumnCount();
			boolean parcours = resultats.next();

			while (parcours) {

				for (int i = 1; i <= nbOls; i++)
					System.out.println(resultats.getString(i) + "");
				System.out.println();
				parcours = resultats.next();
			}

			resultats.close();
		} catch (SQLException e) {
			arret(e.getMessage());
		}

		affiche("fin du programme");
		System.exit(0);

	}
}
