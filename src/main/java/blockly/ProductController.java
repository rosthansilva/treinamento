package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ProductController {

public static final int TIMEOUT = 300;

/**
 *
 * ProductController
 *
 * @param productId
 * @param productQuantity
 *
 * @author Roshan Silva
 * @since 3/29/2023, 9:43:40 AM
 *
 */
public static Var decreaseProductQuantity(@ParamMetaData(description = "productId", id = "69fb884e") Var productId, @ParamMetaData(description = "productQuantity", id = "923996ec") Var productQuantity) throws Exception {
 return new Callable<Var>() {

   private Var product = Var.VAR_NULL;
   private Var response = Var.VAR_NULL;

   public Var call() throws Exception {
    product =
    cronapi.database.Operations.query(Var.valueOf("app.entity.PRODUCT"),Var.valueOf("select \n	p \nfrom \n	PRODUCT p \nwhere \n	p.id = :id"),Var.valueOf("id",productId));
    if (
    Var.valueOf(
    cronapi.database.Operations.getField(product,
    Var.valueOf("this[0].totalQuantity")).compareTo(productQuantity) >= 0).getObjectAsBoolean()) {
        cronapi.database.Operations.execute(Var.valueOf("app.entity.PRODUCT"), Var.valueOf("update \n	PRODUCT  \nset \n	totalQuantity = :totalQuantity \nwhere \n	id = :id"),Var.valueOf("totalQuantity",
        cronapi.math.Operations.subtract(
        cronapi.database.Operations.getField(product,
        Var.valueOf("this[0].totalQuantity")),productQuantity)),Var.valueOf("id",productId));
        response =
        cronapi.map.Operations.createObjectMapWith(Var.valueOf("status",
        Var.VAR_TRUE) , Var.valueOf("msg",
        Var.valueOf("Operação concluida com sucesso")));
    } else {
        response =
        cronapi.map.Operations.createObjectMapWith(Var.valueOf("status",
        Var.VAR_FALSE) , Var.valueOf("msg",
        Var.valueOf("Operação Falhou")));
    }
    return response;
   }
 }.call();
}

/**
 *
 * ProductController
 *
 * @param productId
 * @param productQuantity
 *
 * @author Roshan Silva
 * @since 3/29/2023, 9:43:40 AM
 *
 */
public static Var increaseProductQuantity(@ParamMetaData(description = "productId", id = "69fb884e") Var productId, @ParamMetaData(description = "productQuantity", id = "923996ec") Var productQuantity) throws Exception {
 return new Callable<Var>() {

   private Var product = Var.VAR_NULL;

   public Var call() throws Exception {
    product =
    cronapi.database.Operations.query(Var.valueOf("app.entity.PRODUCT"),Var.valueOf("select \n	p \nfrom \n	PRODUCT p \nwhere \n	p.id = :id"),Var.valueOf("id",productId));
    cronapi.database.Operations.execute(Var.valueOf("app.entity.PRODUCT"), Var.valueOf("update \n	PRODUCT  \nset \n	totalQuantity = :totalQuantity \nwhere \n	id = :id"),Var.valueOf("totalQuantity",
    cronapi.math.Operations.sum(
    cronapi.database.Operations.getField(product,
    Var.valueOf("this[0].totalQuantity")),productQuantity)),Var.valueOf("id",productId));
    return Var.VAR_NULL;
   }
 }.call();
}

}

