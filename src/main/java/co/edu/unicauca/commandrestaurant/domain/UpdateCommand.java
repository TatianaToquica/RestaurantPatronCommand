package co.edu.unicauca.commandrestaurant.domain;

import co.edu.unicauca.commandrestaurant.domain.service.FoodService;
import co.edu.unicauca.commandrestaurant.access.RepositoryFactory;
import co.edu.unicauca.commandrestaurant.access.IFoodRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Comando concreto para modificar una comida
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class UpdateCommand extends Command {

    /**
     * Comida a ser modificada
     */
    private Food food;
    /**
     * Comida previa, que permitirá deshacer la operación de modificar
     */
    private Food foodPrevious;
    /**
     * Instancia del receptor
     */
    private FoodService service;

    /**
     * Constructor parametrizado
     * @param food comida a modificar
     */
    public UpdateCommand(Food food) {
        this.food = food;
        IFoodRepository repo = RepositoryFactory.getInstance().getRepository("default");
        service = new FoodService(repo);
        this.hasUndo = true;
    }

    @Override
    public void execute() {
        Logger logger= LoggerFactory.getLogger(UpdateCommand.class); 
        logger.info("Comando de edición se ha ejecutado. Se grabó la comida " + food);            
        service.update(food);
    }

    @Override
    public void undo() {
        Logger logger= LoggerFactory.getLogger(UpdateCommand.class); 
        logger.info("Comando de edición se ha deshecho. Se grabó la comida " + foodPrevious);             
        service.update(foodPrevious);
    }

    public Food getFoodPrevious() {
        return foodPrevious;
    }

    public void setFoodPrevious(Food componentPrevious) {
        this.foodPrevious = componentPrevious;
    }

}
