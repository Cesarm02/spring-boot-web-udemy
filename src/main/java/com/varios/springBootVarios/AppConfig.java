package com.varios.springBootVarios;

import com.varios.springBootVarios.di.models.service.IServicio;
import com.varios.springBootVarios.di.models.service.MiServicio;
import com.varios.springBootVarios.di.models.service.MiServicioComplejo;
import com.varios.springBootVarios.facturas.models.domain.ItemFactura;
import com.varios.springBootVarios.facturas.models.domain.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    public IServicio iServicio(){
        return new MiServicio();
    }
    @Bean("miServicioComplejo")
    @Primary
    public IServicio servicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto = new Producto("Camara", 100);
        Producto producto2 = new Producto("Bici", 200);

        ItemFactura itemFactura = new ItemFactura(producto, 2);
        ItemFactura itemFactura2 = new ItemFactura(producto2, 4);

        return Arrays.asList(itemFactura, itemFactura2);
    }

    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto = new Producto("Televisor ", 250);
        Producto producto2 = new Producto("Notebook", 500);
        Producto producto3 = new Producto("Impresora", 80);
        Producto producto4 = new Producto("Escritorio", 300);

        ItemFactura itemFactura = new ItemFactura(producto, 2);
        ItemFactura itemFactura2 = new ItemFactura(producto2, 1);
        ItemFactura itemFactura3 = new ItemFactura(producto3, 1);
        ItemFactura itemFactura4 = new ItemFactura(producto4, 1);

        return Arrays.asList(itemFactura, itemFactura2, itemFactura3, itemFactura4);
    }
}
