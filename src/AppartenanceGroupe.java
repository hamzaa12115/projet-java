public class AppartenanceGroupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "groupe_id")
    private Groupe groupe;

    private String role; // Par exemple : membre, responsable, etc.

    // Getters et Setters
}
