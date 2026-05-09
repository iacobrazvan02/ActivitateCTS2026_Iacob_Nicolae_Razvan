package ModelPlatformaStreamingFilme.Builder;

public class SearchingFilter implements AbstractSearchingFilter{
    private final String titlu;
    private final int an;
    private final String gen;
    private final String actori;
    private final double rating;
    private final boolean recomandat;

    public SearchingFilter(String titlu, int an, String gen, String actori, double rating, boolean recomandat) {
        this.titlu = titlu;
        this.an = an;
        this.gen = gen;
        this.actori = actori;
        this.rating = rating;
        this.recomandat = recomandat;
    }

    @Override
    public String getConditiiFiltrare() {
        return this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchingFilter{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", an=").append(an);
        sb.append(", gen='").append(gen).append('\'');
        sb.append(", actori='").append(actori).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", recomandat=").append(recomandat);
        sb.append('}');
        return sb.toString();
    }
}