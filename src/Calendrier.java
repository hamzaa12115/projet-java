public class Calendrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private boolean estPartage;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur proprietaire;

    // Getters et Setters
}
