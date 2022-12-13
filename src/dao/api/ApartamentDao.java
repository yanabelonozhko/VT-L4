package dao.api;

import dao.Dao;
import entity.Apartment;
import exeptions.DaoException;

import java.util.List;

public interface ApartamentDao extends Dao<Apartment> {
    List<Apartment> findByStatus(String status) throws DaoException;

    List<Apartment> findByType(String type) throws DaoException;

    void updateApartmentById(int id,Apartment apartment) throws DaoException;

    void updateApartmentStatusById(int id,String status) throws DaoException;
}
