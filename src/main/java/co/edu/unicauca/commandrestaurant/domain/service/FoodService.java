package co.edu.unicauca.commandrestaurant.domain.service;

import java.util.List;
import co.edu.unicauca.commandrestaurant.access.IFoodRepository;
import co.edu.unicauca.commandrestaurant.domain.Food;

/**
 * Fachada de los servicios de comida. Es el receptor, al cual se le ejecutan
 * sus operaciones mediante comandos
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class FoodService {

    /**
     * Dependencia abstracta al repositorio
     */
    private IFoodRepository repo;

    /**
     * Construcor parametrizado
     *
     * @param repo repositorio que es inyectado
     */
    public FoodService(IFoodRepository repo) {
        this.repo = repo;

    }

    /**
     * Crear una comida
     *
     * @param food comdia a crearse en la bd
     */
    public void create(Food food) {
        repo.create(food);
    }

    /**
     * Modifica una comida
     *
     * @param food comida a ser grabada en la bd
     */
    public void update(Food food) {
        repo.update(food);
    }

    /**
     * Eliminar comida
     *
     * @param id identificador de la comida
     */
    public void delete(int id) {
        repo.delete(id);
    }

    /**
     * Buscar todas las comidas
     *
     * @return lista de comidas
     */
    public List<Food> findAll() {
        return repo.findAll();
    }

    /**
     * Buscar comida por su id
     *
     * @param id identificador de la comida
     * @return Comida
     */
    public Food findByIdl(int id) {
        return repo.findById(id);
    }

}
