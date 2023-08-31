package com.varios.springBootVarios.facturas.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;
import java.util.List;

@Component
@RequestScope
public class Factura implements Serializable {

    private static final long serialVersionUID= 1L;

    @Value("factura.desripcion")
    private String descripcion;
    @Autowired
    private Cliente cliente;
    @Autowired
    private List<ItemFactura> itemFacturas;

    @PostConstruct
    public void inicializar(){
        cliente.setNombre(cliente.getNombre().concat(" ").concat("Estiven"));
        descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Factura destruida: ".concat(descripcion));
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItemFacturas() {
        return itemFacturas;
    }

    public void setItemFacturas(List<ItemFactura> itemFacturas) {
        this.itemFacturas = itemFacturas;
    }
}
