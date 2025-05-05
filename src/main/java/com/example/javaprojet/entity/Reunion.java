public class Reunion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private String lienMeet;
    private LocalDateTime dateDebut;
    private int dureeMinutes;
    private boolean obligatoire;

    @ManyToOne
    @JoinColumn(name = "projet_id")
    private Projet projet;

    // Getters et Setters
}
