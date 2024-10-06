import br.com.one.services.ApiService;

public class Main {
    public static void main(String[] args) {
        ApiService apiService = new ApiService();
        apiService.Moeda("USD", "BRL", 1.0);

    }
}