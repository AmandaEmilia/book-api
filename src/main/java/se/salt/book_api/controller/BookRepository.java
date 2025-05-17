package se.salt.book_api.controller;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    public List<Book> findAll() {
        return List.of(

                Book.builder()
                        .id(64L)
                        .title("The Housemaid")
                        .author("Freida McFadden")
                        .about("Nina Winchester says as I shake her elegant, manicured hand. I smile politely, gazing around the marble hallway. Working here is my last chance to start fresh. I can pretend to be whoever I like. But I''ll soon learn that the Winchesters'' secrets are far more dangerous than my own . . .")
                        .rating(3)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1646534743i/60556912.jpg")
                        .build(),

                Book.builder()
                        .id(21L)
                        .title("Before the Coffee Gets Cold")
                        .author("Toshikazu Kawaguchi")
                        .about("In a cosy back alley in Tokyo, there is a cafe which has been serving carefully brewed coffee for more than one hundred years. But this coffee shop offers its customers a unique experience: the chance to travel back in time.")
                        .rating(1)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1704153539i/44421460.jpg")
                        .build(),

                Book.builder()
                        .id(40L)
                        .title("Things We Never Got Over")
                        .author("Lucy Score")
                        .about("A spicy contemporary rom-com set in the town of Knockemout from bestselling author and TikTok sensation, Lucy Score.\n")
                        .rating(4)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1641629293i/60060431.jpg")
                        .build(),

                Book.builder()
                        .id(26L)
                        .title("A Court of Frost and Starlight")
                        .author("Sarah J. Maas")
                        .about("In this companion tale to the bestselling A Court of Thorns and Roses series, Feyre, Rhys and their friends are working to rebuild the Night Court and the vastly changed world beyond after the events of A Court of Wings and Ruin.\n")
                        .rating(0)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1585622963i/50659471.jpg")
                        .build(),


                Book.builder()
                        .id(2L)
                        .title("Think and Grow Rich")
                        .author("Napoleon Hill")
                        .about("Think and Grow Rich has been called the Granddaddy of All Motivational Literature. It was the first book to boldly ask, What makes a winner? The man who asked and listened for the answer, Napoleon Hill, is now counted in the top ranks of the world's winners himself.")
                        .rating(2)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1463241782i/30186948.jpg")
                        .build(),

                Book.builder()
                        .id(57L)
                        .title("Flock")
                        .author("Kate Stewart")
                        .about("The deal is simple: all nineteen-year-old student Cecelia Horner has to do is survive a year in the small town of Triple Falls, living with her estranged father and working at his factory. In return, he’ll not only pay her college tuition but will hand over a small fortune that will enable Cecelia to help her single mother.")
                        .rating(2)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1594825119i/40748777.jpg")
                        .build(),


                Book.builder()
                        .id(42L)
                        .title("Spelet")
                        .author("Elle Kennedy")
                        .about("Hannah Wells har äntligen hittat någon som intresserar henne. Problemet är bara att han inte vet att hon existerar. Även om hon är självsäker på alla andra sätt så är just förförelse en färdighet hon saknar. Den enda lösningen är att ta till svartsjuka som vapen, även om det innebär att hon måste stå ut med att hjälpa en irriterande hockeykapten att höja sina betyg.")
                        .rating(4)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1688034245i/181736167.jpg")
                        .build(),

                Book.builder()
                        .id(0L)
                        .title("All Your Perfects")
                        .author("Colleen Hoover")
                        .about("Quinn and Graham's perfect love is threatened by their imperfect marriage. The memories, mistakes, and secrets that they have built up over the years are now tearing them apart. The one thing that could save them might also be the very thing that pushes their marriage beyond the point of repair.")
                        .rating(4)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1531682842i/38926487.jpg")
                        .build(),

                Book.builder()
                        .id(0L)
                        .title("Sökaren")
                        .author("Tana French")
                        .about("Cal Hooper trodde att en by på den irländska landsbygden skulle vara den perfekta tillflyktsorten. Efter tjugofem år som polis i Chicago och en uppslitande skilsmässa längtar han efter ett lugnt liv på en vacker plats, med en pub inom rimligt avstånd.")
                        .rating(0)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1683206384i/148900585.jpg")
                        .build(),

                Book.builder()
                        .id(8L)
                        .title("Too Late")
                        .author("Colleen Hoover")
                        .about("Sloan will go through hell and back for those she loves. And she does so, every single day. Caught up with the alluring Asa Jackson, a notorious drug trafficker, Sloan has finally found a lifeline to cling to, even if it''s meant compromising her morals")
                        .rating(4)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1683212089i/127555313.jpg")
                        .build(),

                Book.builder()
                        .id(70L)
                        .title("The Laws of Human Nature")
                        .author("Robert Greene")
                        .about("We are social animals. Our very lives depend on our relationships with people. Knowing why people do what they do is the most important tool we can possess, without which our other talents can only take us so far.")
                        .rating(0)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1620206225i/39330937.jpg")
                        .build(),

                Book.builder()
                        .id(31L)
                        .title("Rouge")
                        .author("Mona Awad")
                        .about("The trancelike, rhapsodic language and deepening atmosphere of unreality make for a narrative that oozes with unease.")
                        .rating(2)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1684423250i/157184735.jpg")
                        .build(),


                Book.builder()
                        .id(23L)
                        .title("King of Wrath")
                        .author("Ana Huang")
                        .about("Ruthless. Meticulous. Arrogant. Dante Russo thrives on control, both personally and professionally. The billionaire CEO never planned to marry - until the threat of blackmail forces him into an engagement with a woman he barely knows")
                        .rating(1)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1742667348i/217206738.jpg")
                        .build(),

                Book.builder()
                        .id(7L)
                        .title("Hooked")
                        .author("Emily McIntire")
                        .about("James has always had one agenda: destroy his enemy, Peter Michaels. When Peter''s twenty-year-old daughter Wendy shows up in James''s bar, he sees his way in. Seduce the girl and use her for his revenge.")
                        .rating(3)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1671559739i/72256452.jpg")
                        .build(),

                Book.builder()
                        .id(92L)
                        .title("The Lost Bookshop")
                        .author("Evie Woods")
                        .about("For too long, Opaline, Martha and Henry have been the side characters in their own lives.")
                        .rating(4)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1721406796i/65137920.jpg")
                        .build(),

                Book.builder()
                        .id(87L)
                        .title("Say You Swear")
                        .author("Meagan Brandy")
                        .about("For years, I''ve dreamt of what college life could bring and while some things changed, there was always one constant.")
                        .rating(3)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1644343501i/58925247.jpg")
                        .build(),


                Book.builder()
                        .id(34L)
                        .title("Icebreaker")
                        .author("Hannah Grace")
                        .about("Anastasia Allen has worked her entire life for a shot at Team USA. It looks like everything is going according to plan when she gets a full scholarship to the University of California, Maple Hills and lands a place on their competitive figure skating team.")
                        .rating(3)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1659045816i/61767292.jpg")
                        .build(),

                Book.builder()
                        .id(11L)
                        .title("The Inmate")
                        .author("Freida McFadden")
                        .about("The guiltiest people aren't always the ones behind bars... As a new nurse practitioner at a maximum-security prison, Brooke Sullivan is taught three crucial rules")
                        .rating(2)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1653271523i/61149872.jpg")
                        .build(),


                Book.builder()
                        .id(3L)
                        .title("The Brothers Karamazov")
                        .author("Fyodor Dostoyevsky")
                        .about("When brutal landowner Fyodor Karamazov is murdered, the lives of his sons are changed irrevocably: Mitya, the sensualist, whose bitter rivalry with his father immediately places him under suspicion for parricide")
                        .rating(3)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1385583749i/19007626.jpg")
                        .build(),

                Book.builder()
                        .id(64L)
                        .title("A Court of Wings and Ruin")
                        .author("Sarah J. Maas")
                        .about("Feyre has returned to the Spring Court, determined to gather information on Tamlin's manoeuvrings and the invading king threatening to bring her land to its knees. But to do so she must play a deadly game of deceit - and one slip may spell doom not only for Feyre, but for her world as well.")
                        .rating(3)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1585623092i/50659472.jpg")
                        .build(),

                Book.builder()
                        .id(16L)
                        .title("My Killer Vacation")
                        .author("Tessa Bailey")
                        .about("It was supposed to be a relaxing vacation in sweet, sunny Cape Cod-just me and my beloved brother-but discovering a corpse in our rental house really throws a wrench into our tanning schedule. ")
                        .rating(2)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1651255986i/60191114.jpg")
                        .build(),

                Book.builder()
                        .id(31L)
                        .title("The Odyssey")
                        .author("Homer")
                        .about("A lean, fleet-footed translation that recaptures Homer's \"nimble gallop\" and brings an ancient epic to new life.")
                        .rating(0)
                        .coverImg("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1711957706i/1381.jpg")
                        .build()
        );
    }

}
