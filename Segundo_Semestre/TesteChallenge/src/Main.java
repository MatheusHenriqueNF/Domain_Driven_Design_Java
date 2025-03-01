import java.util.*;

class Node {
    String name;

    Node(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Node node = (Node) obj;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

class Edge {
    Node from, to;
    int weight;

    Edge(Node from, Node to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}

class Graph {
    private final Map<Node, List<Edge>> adjacencyList = new HashMap<>();

    void addEdge(String from, String to, int weight) {
        Node fromNode = new Node(from);
        Node toNode = new Node(to);
        adjacencyList.putIfAbsent(fromNode, new ArrayList<>());
        adjacencyList.putIfAbsent(toNode, new ArrayList<>());
        adjacencyList.get(fromNode).add(new Edge(fromNode, toNode, weight));
    }

    Map<Node, List<Edge>> getGraph() {
        return adjacencyList;
    }
}

class PathFinder {
    static List<String> dijkstra(Graph graph, String start, String end) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> distances.getOrDefault(node.name, Integer.MAX_VALUE)));

        for (Node node : graph.getGraph().keySet()) {
            distances.put(node.name, Integer.MAX_VALUE);
            previous.put(node.name, null);
        }

        distances.put(start, 0);
        queue.add(new Node(start));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.name.equals(end)) break;

            for (Edge edge : graph.getGraph().getOrDefault(current, new ArrayList<>())) {
                int newDist = distances.get(current.name) + edge.weight;
                if (newDist < distances.get(edge.to.name)) {
                    distances.put(edge.to.name, newDist);
                    previous.put(edge.to.name, current.name);
                    queue.add(edge.to);
                }
            }
        }

        List<String> path = new ArrayList<>();
        for (String at = end; at != null; at = previous.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);
        return path;
    }
}


class Teste {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Linha 8-Diamante
        graph.addEdge("Júlio Prestes", "Palmeiras-Barra Funda", 1);
        graph.addEdge("Palmeiras-Barra Funda", "Júlio Prestes", 1);
        graph.addEdge("Palmeiras-Barra Funda", "Lapa", 1);
        graph.addEdge("Lapa", "Palmeiras-Barra Funda", 1);
        graph.addEdge("Lapa", "Domingos de Moraes", 1);
        graph.addEdge("Domingos de Moraes", "Lapa", 1);
        graph.addEdge("Domingos de Moraes", "Imperatriz Leopoldina", 1);
        graph.addEdge("Imperatriz Leopoldina", "Domingos de Moraes", 1);
        graph.addEdge("Imperatriz Leopoldina", "Presidente Altino", 1);
        graph.addEdge("Presidente Altino", "Imperatriz Leopoldina", 1);
        graph.addEdge("Presidente Altino", "Osasco", 1);
        graph.addEdge("Osasco", "Presidente Altino", 1);
        graph.addEdge("Osasco", "Comandante Sampaio", 1);
        graph.addEdge("Comandante Sampaio", "Osasco", 1);
        graph.addEdge("Comandante Sampaio", "Quitaúna", 1);
        graph.addEdge("Quitaúna", "Comandante Sampaio", 1);
        graph.addEdge("Quitaúna", "General Miguel Costa", 1);
        graph.addEdge("General Miguel Costa", "Quitaúna", 1);
        graph.addEdge("General Miguel Costa", "Carapicuíba", 1);
        graph.addEdge("Carapicuíba", "General Miguel Costa", 1);
        graph.addEdge("Carapicuíba", "Santa Terezinha", 1);
        graph.addEdge("Santa Terezinha", "Carapicuíba", 1);
        graph.addEdge("Santa Terezinha", "Antonio João", 1);
        graph.addEdge("Antonio João", "Santa Terezinha", 1);
        graph.addEdge("Antonio João", "Barueri", 1);
        graph.addEdge("Barueri", "Antonio João", 1);
        graph.addEdge("Barueri", "Jardim Belval", 1);
        graph.addEdge("Jardim Belval", "Barueri", 1);
        graph.addEdge("Jardim Belval", "Jardim Silveira", 1);
        graph.addEdge("Jardim Silveira", "Jardim Belval", 1);
        graph.addEdge("Jardim Silveira", "Jandira", 1);
        graph.addEdge("Jandira", "Jardim Silveira", 1);
        graph.addEdge("Jandira", "Sagrado Coração", 1);
        graph.addEdge("Sagrado Coração", "Jandira", 1);
        graph.addEdge("Sagrado Coração", "Engenheiro Cardoso", 1);
        graph.addEdge("Engenheiro Cardoso", "Sagrado Coração", 1);
        graph.addEdge("Engenheiro Cardoso", "Itapevi", 1);
        graph.addEdge("Itapevi", "Engenheiro Cardoso", 1);
        graph.addEdge("Itapevi", "Amador Bueno", 1);
        graph.addEdge("Amador Bueno", "Itapevi", 1);

        //Linha 9-Esmeralda
        graph.addEdge("Ceasa", "Presidente Altino", 1);
        graph.addEdge("Presidente Altino", "Ceasa", 1);
        graph.addEdge("Ceasa", "Villa-Lobos - Jaguaré", 1);
        graph.addEdge("Villa-Lobos - Jaguaré", "Ceasa", 1);
        graph.addEdge("Villa-Lobos - Jaguaré", "Cidade Universitária", 1);
        graph.addEdge("Cidade Universitária", "Villa-Lobos - Jaguaré", 1);
        graph.addEdge("Cidade Universitária", "Pinheiros", 1);
        graph.addEdge("Pinheiros", "Cidade Universitária", 1);
        graph.addEdge("Pinheiros", "Hebraica-Rebouças", 1);
        graph.addEdge("Hebraica-Rebouças", "Pinheiros", 1);
        graph.addEdge("Pinheiros", "Faria Lima", 1);
        graph.addEdge("Faria Lima", "Pinheiros", 1);
        graph.addEdge("Hebraica-Rebouças", "Cidade Jardim", 1);
        graph.addEdge("Cidade Jardim", "Hebraica-Rebouças", 1);
        graph.addEdge("Cidade Jardim", "Vila Olímpia", 1);
        graph.addEdge("Vila Olímpia", "Cidade Jardim", 1);
        graph.addEdge("Vila Olímpia", "Berrini", 1);
        graph.addEdge("Berrini", "Vila Olímpia", 1);
        graph.addEdge("Berrini", "Morumbi", 1);
        graph.addEdge("Morumbi", "Berrini", 1);
        graph.addEdge("Morumbi", "Granja Julieta", 1);
        graph.addEdge("Granja Julieta", "Morumbi", 1);
        graph.addEdge("Granja Julieta", "Santo Amaro", 1);
        graph.addEdge("Santo Amaro", "Granja Julieta", 1);
        graph.addEdge("Santo Amaro", "Socorro", 1);
        graph.addEdge("Socorro", "Santo Amaro", 1);
        graph.addEdge("Socorro", "Jurubatuba", 1);
        graph.addEdge("Jurubatuba", "Socorro", 1);
        graph.addEdge("Jurubatuba", "Autódromo", 1);
        graph.addEdge("Autódromo", "Jurubatuba", 1);
        graph.addEdge("Autódromo", "Interlagos", 1);
        graph.addEdge("Interlagos", "Autódromo", 1);
        graph.addEdge("Interlagos", "Grajaú", 1);
        graph.addEdge("Grajaú", "Interlagos", 1);
        graph.addEdge("Grajaú", "Mendes-Vila Natal", 1);
        graph.addEdge("Mendes-Vila Natal", "Grajaú", 1);

        //Linha 1-Azul
        graph.addEdge("Jabaquara", "Conceição", 1);
        graph.addEdge("Conceição", "Jabaquara", 1);
        graph.addEdge("Conceição", "São Judas", 1);
        graph.addEdge("São Judas", "Conceição", 1);
        graph.addEdge("São Judas", "Saúde", 1);
        graph.addEdge("Saúde", "São Judas", 1);
        graph.addEdge("Saúde", "Praça da Árvore", 1);
        graph.addEdge("Praça da Árvore", "Saúde", 1);
        graph.addEdge("Praça da Árvore", "Santa Cruz", 1);
        graph.addEdge("Santa Cruz", "Praça da Árvore", 1);
        graph.addEdge("Santa Cruz", "Vila Mariana", 1);
        graph.addEdge("Vila Mariana", "Santa Cruz", 1);
        graph.addEdge("Vila Mariana", "Ana Rosa", 1);
        graph.addEdge("Ana Rosa", "Vila Mariana", 1);
        graph.addEdge("Ana Rosa", "Paraíso", 1);
        graph.addEdge("Paraíso", "Ana Rosa", 1);
        graph.addEdge("Paraíso", "Vergueiro", 1);
        graph.addEdge("Vergueiro", "Paraíso", 1);
        graph.addEdge("Vergueiro", "São Joaquim", 1);
        graph.addEdge("São Joaquim", "Vergueiro", 1);
        graph.addEdge("São Joaquim", "Liberdade", 1);
        graph.addEdge("Liberdade", "São Joaquim", 1);
        graph.addEdge("Liberdade", "Sé", 1);
        graph.addEdge("Sé", "Liberdade", 1);
        graph.addEdge("Sé", "São Bento", 1);
        graph.addEdge("São Bento", "Sé", 1);
        graph.addEdge("São Bento", "Luz", 1);
        graph.addEdge("Luz", "São Bento", 1);
        graph.addEdge("Luz", "Tiradentes", 1);
        graph.addEdge("Tiradentes", "Luz", 1);
        graph.addEdge("Tiradentes", "Armênia", 1);
        graph.addEdge("Armênia", "Tiradentes", 1);
        graph.addEdge("Armênia", "Portuguesa-Tietê", 1);
        graph.addEdge("Portuguesa-Tietê", "Armênia", 1);
        graph.addEdge("Portuguesa-Tietê", "Carandiru", 1);
        graph.addEdge("Carandiru", "Portuguesa-Tietê", 1);
        graph.addEdge("Carandiru", "Santana", 1);
        graph.addEdge("Santana", "Carandiru", 1);
        graph.addEdge("Santana", "Jardim São Paulo-Ayrton Senna", 1);
        graph.addEdge("Jardim São Paulo-Ayrton Senna", "Santana", 1);
        graph.addEdge("Jardim São Paulo-Ayrton Senna", "Parada Inglesa", 1);
        graph.addEdge("Parada Inglesa", "Jardim São Paulo-Ayrton Senna", 1);
        graph.addEdge("Parada Inglesa", "Tucuruvi", 1);
        graph.addEdge("Tucuruvi", "Parada Inglesa", 1);


        //Linha 2-Verde
        graph.addEdge("Vila Madalena", "Santuário Nossa Senhora de Fátima-Sumaré", 1);
        graph.addEdge("Santuário Nossa Senhora de Fátima-Sumaré", "Vila Madalena", 1);
        graph.addEdge("Santuário Nossa Senhora de Fátima-Sumaré", "Clínicas", 1);
        graph.addEdge("Clínicas", "Santuário Nossa Senhora de Fátima-Sumaré", 1);
        graph.addEdge("Clínicas", "Consolação", 1);
        graph.addEdge("Consolação", "Clínicas", 1);
        graph.addEdge("Consolação", "Trianon-Masp", 1);
        graph.addEdge("Trianon-Masp", "Consolação", 1);
        graph.addEdge("Trianon-Masp", "Brigadeiro", 1);
        graph.addEdge("Brigadeiro", "Trianon-Masp", 1);
        graph.addEdge("Brigadeiro", "Paraíso", 1);
        graph.addEdge("Paraíso", "Brigadeiro", 1);
        graph.addEdge("Ana Rosa", "Paraíso", 1);
        graph.addEdge("Paraíso", "Ana Rosa", 1);
        graph.addEdge("Ana Rosa", "Chácara Klabin", 1);
        graph.addEdge("Chácara Klabin", "Ana Rosa", 1);
        graph.addEdge("Chácara Klabin", "Santos-Imigrantes", 1);
        graph.addEdge("Santos-Imigrantes", "Chácara Klabin", 1);
        graph.addEdge("Santos-Imigrantes", "Alto do Ipiranga", 1);
        graph.addEdge("Alto do Ipiranga", "Santos-Imigrantes", 1);
        graph.addEdge("Alto do Ipiranga", "Sacomã", 1);
        graph.addEdge("Sacomã", "Alto do Ipiranga", 1);
        graph.addEdge("Sacomã", "Tamanduateí", 1);
        graph.addEdge("Tamanduateí", "Sacomã", 1);
        graph.addEdge("Tamanduateí", "Vila Prudente", 1);
        graph.addEdge("Vila Prudente", "Tamanduateí", 1);

        //Linha 4-Amarela
        graph.addEdge("República", "Luz", 1);
        graph.addEdge("Luz", "República", 1);
        graph.addEdge("República", "Higienópolis-Mackenzie", 1);
        graph.addEdge("Higienópolis-Mackenzie", "República", 1);
        graph.addEdge("Higienópolis-Mackenzie", "Paulista", 1);
        graph.addEdge("Paulista", "Higienópolis-Mackenzie", 1);
        graph.addEdge("Paulista", "Oscar Freire", 1);
        graph.addEdge("Oscar Freire", "Paulista", 1);
        graph.addEdge("Oscar Freire", "Fradinho Coutinho", 1);
        graph.addEdge("Fradinho Coutinho", "Oscar Freire", 1);
        graph.addEdge("Fradinho Coutinho", "Faria Lima", 1);
        graph.addEdge("Faria Lima", "Fradinho Coutinho", 1);
        graph.addEdge("Faria Lima", "Pinheiros", 1);
        graph.addEdge("Pinheiros", "Faria Lima", 1);
        graph.addEdge("Butantã", "Pinheiros", 1);
        graph.addEdge("Pinheiros", "Butantã", 1);
        graph.addEdge("Butantã", "São Paulo-Morumbi", 1);
        graph.addEdge("São Paulo-Morumbi", "Butantã", 1);
        graph.addEdge("São Paulo-Morumbi", "Vila Sônia", 1);
        graph.addEdge("Vila Sônia", "São Paulo-Morumbi", 1);

        List<String> shortestPath = PathFinder.dijkstra(graph, "Vila Mariana", "Santana");
        System.out.println("Menor caminho: " + shortestPath);
    }
}