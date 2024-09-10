package com.haruns._01_JDBC_ETicaret.repository;

import com.haruns._01_JDBC_ETicaret.entity.Musteri;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class MusteriRepository implements ICrud<Musteri> {
	private final DatabaseHelper databaseHelper;
	private String sql;
	
	public MusteriRepository() {
		this.databaseHelper = new DatabaseHelper();
	}
	
	public void save(Musteri musteri) {
		sql =
				("INSERT INTO tblmusteriler (ad,soyad,cinsiyet,dtarih,tel,email,sehir) VALUES ('%s','%s','%s','%s'," +
						"'%s','%s','%s')").formatted(musteri.getAd(), musteri.getSoyad(), musteri.getCinsiyet(),
				                                     musteri.getDtarih(), musteri.getTel(), musteri.getEmail(),
				                                     musteri.getSehir());
		databaseHelper.executeUpdate(sql);
	}
	
	public void update(Musteri musteri) {
		sql =
				("UPDATE tblmusteriler SET ad='%s',soyad='%s',cinsiyet='%s',dtarih='%s',tel='%s',email='%s',sehir='%s' " +
						"WHERE id=%d").formatted(musteri.getAd(), musteri.getSoyad(), musteri.getCinsiyet(),
				                                 musteri.getDtarih(), musteri.getTel(), musteri.getEmail(),
				                                 musteri.getSehir(), musteri.getId());
		databaseHelper.executeUpdate(sql);
	}
	
	public void delete(int silinecekMusteriId) {
		sql = "DELETE FROM tblmusteriler WHERE id=" + silinecekMusteriId;
		databaseHelper.executeUpdate(sql);
	}
	
	public List<Musteri> findAll() {
		sql = "SELECT * FROM tblmusteriler ORDER BY id DESC";
		Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
		List<Musteri> musteriList = new ArrayList<>();
		try {
			if (resultSet.isPresent()) {
				ResultSet rs = resultSet.get();
				while (rs.next()) {
					musteriList.add(getValueFromResultSet(rs));
				}
			}
		}
		catch (SQLException e) {
			System.out.println("Müşteri Listesi getirirken bir sorun yaşandı. " + e.getMessage());
		}
		return musteriList;
	}
	
	public Optional<Musteri> findById(int bulunacakMusteriID) {
		sql = "SELECT * FROM tblmusteriler WHERE id=" + bulunacakMusteriID;
		Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
		try {
			if (resultSet.isPresent()) {
				ResultSet rs = resultSet.get();
				if (rs.next()) {
					return Optional.of(getValueFromResultSet(rs));
				}
			}
		}
		catch (SQLException e) {
			System.out.println("Müşteri bulmada sorun yaşandı. " + e.getMessage());
		}
		return Optional.empty();
	}
	
	private Musteri getValueFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String ad = rs.getString("ad");
		String soyad = rs.getString("soyad");
		String cinsiyet = rs.getString("cinsiyet");
		String dtarih = rs.getString("dtarih");
		String tel = rs.getString("tel");
		String email = rs.getString("email");
		String sehir = rs.getString("sehir");
		int state = rs.getInt("state");
		Long createat = rs.getLong("createat");
		Long updateat = rs.getLong("updateat");
		return new Musteri(id, ad, soyad, cinsiyet, LocalDate.parse(dtarih), tel, email, sehir, state,
				            createat, updateat);
	}
}