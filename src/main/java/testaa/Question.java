package testaa;
// Generated 15 juin 2023, 19:03:38 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Question generated by hbm2java
 */
@Entity
@Table(name = "question", catalog = "pfe")
public class Question implements java.io.Serializable {

	private Integer idQst;
	private Quiz quiz;
	private Double note;
	private String question;
	private String reponse;

	public Question() {
	}

	public Question(Quiz quiz, String question) {
		this.quiz = quiz;
		this.question = question;
	}

	public Question(Quiz quiz, Double note, String question, String reponse) {
		this.quiz = quiz;
		this.note = note;
		this.question = question;
		this.reponse = reponse;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_qst", unique = true, nullable = false)
	public Integer getIdQst() {
		return this.idQst;
	}

	public void setIdQst(Integer idQst) {
		this.idQst = idQst;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quiz", nullable = false)
	public Quiz getQuiz() {
		return this.quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	@Column(name = "note", precision = 22, scale = 0)
	public Double getNote() {
		return this.note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	@Column(name = "question", nullable = false)
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Column(name = "reponse")
	public String getReponse() {
		return this.reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

}
