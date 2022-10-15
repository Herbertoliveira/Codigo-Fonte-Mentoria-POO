public class App {
    public static void main(String[] args) {
        Endereco enderecoRestauranteHerbert = new Endereco();

        Endereco enderecoRestauranteHerbert2 = new Endereco("12334-364","Endereço Restaurante Herbert");
        Endereco enderecoRestauranteMonique = new Endereco("32536-437","Endereço Restaurante Monique");
       
        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante de Herbert");
        restaurante.setCnpj("1080.1099.0886-9");
        restaurante.setEndereco(enderecoRestauranteHerbert2);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante de Monique");
        restaurante2.setCnpj("4356.2749.8346-6");
        restaurante2.setEndereco(enderecoRestauranteMonique);
       

        System.out.println(restaurante);

        System.out.println(restaurante2);
        
    }
}
