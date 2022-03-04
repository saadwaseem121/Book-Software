package com.example.demo.book;

import com.example.demo.author.Author;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner bookCommandLineRunner(BookRepository repository){
        return args->
        {
            //create and implement author classes before putting them as parameters for the books
            Author jkRowling = new Author("J.K.", "Rowling", "", "Bloomsbury");
            Author jrrTolkien = new Author("J.R.R.", "Tolkien", "", "Harper Collins");
            Author stephenKing = new Author("Stephen", "King", "", "");


            //add books by declaring their ISBN, title, author, genre, description,
            //publisher, year of publication, and price in that order
            //
            //book description must be less than 250 words
            Book book1 = new Book("0747532699", "Harry Potter and the Sorcerer's Stone", jkRowling, "Fantasy",
                        "Harry Potter and the Sorcerer's Stone is an enthralling start to" +
                        "  Harry's journey toward coming to terms with his past and facing his future.",
                        "Bloomsbury", 1997, 12.99);

            Book book2 = new Book("0261103342", "The Hobbit", jrrTolkien, "High fantasy",
                    "The distinctly homely Bilbo Baggins hears the siren bell for adventure and" +
                            "leaves his nest to collect a share of the treasure guarded by the dragon Smaug.",
                    "Harper Collins", 1937, 14.99);

            Book book3 = new Book("0670813028", "It", stephenKing, "Horror",
                    "One of Stephen King's most prolific novels, starring the iconic clown character, " +
                            "Pennywise.", "Viking", 1986, 20.99);

            Book book4 = new Book("9780439139595", "Harry Potter and the Goblet of Fire", jkRowling, "Fantasy",
                    "It follows Harry fourth year at Hogwarts and the mystery surrounding the entry of his name into the Triwizard Tournament in which he is forced to compete",
                    "Scholastic", 2000, 23.18);

            Book book5 = new Book("9780439358064", "Harry Potter and the Order of the Phoenix", jkRowling, "Fantasy",
                    "It follows Harry Potter's struggles in his fifth year at Hogwarts, including the surreptitious return of the antagonist Lord Voldemort.",
                    "Arthur A. Levine Books", 2003, 13.69);

            Book book6 = new Book("9780439784542", "Harry Potter and the Half-Blood Prince", jkRowling, "Fantasy",
                    "The sixth novel explores the past of nemesis Voldemort, and Harry's preparations for the final battle against him alongside headmaster & mentor Albus Dumbledore.",
                    "Arthur A. Levine Books", 2005, 14.74);

            Book book7 = new Book("9780545010221", "Harry Potter and the Deathly Hallows", jkRowling, "Fantasy",
                    "Harry Potter and the Deathly Hallows is the seventh and final novel of the main Harry Potter series.",
                    "Arthur A. Levine Books", 2007, 21.74);

//            Book book8 = new Book("9780064407663", "The Bad Beginning (A Series of Unfortunate Events #1))", "Lemony Snicket", "Mystery",
//                    "Its the story of three orphan children, Violet, Klaus, & Sunny Baudelaire who are sent to live with Count Olaf, who attempts to steal their inheritance.",
//                    "HarperCollins", 1999, 8.96);
//
//            Book book9 = new Book("9780064407670", "The Reptile Room (A Series of Unfortunate Events #2))", "Lemony Snicket", "Mystery",
//                    "The second book follows the Baudelaire orphans, as they are sent to live with a distant relative named Montgomery whiles escaping Count Olaf.",
//                    "HarperCollins", 1999, 9.38);
//
//            Book book10 = new Book("9780064407687", "The Wide Window (A Series of Unfortunate Events #3))", "Lemony Snicket", "Mystery",
//                    "The third book follows the Baudelaire orphans who goes to live with their aunt Josephine, who is seemingly scared of everything.",
//                    "HarperCollins", 2000, 6.88);
//
//            Book book11 = new Book("9780064407694", "The Miserable Mill (A Series of Unfortunate Events, #4))", "Lemony Snicket", "Mystery",
//                    "In the fourth novel of the series the Baudelaire orphans live with the owner of Lucky Smells Lumber Mill.",
//                    "HarperCollins", 2000, 9.79);
//
//            Book book12 = new Book("9780064408639", "The Austere Academy (A Series of Unfortunate Events, #5))", "Lemony Snicket", "Mystery",
//                    "In the fifth novel The Baudelaire orphans are sent to a boarding school, overseen by monstrous employees. They meet new friends, enemies, & Count Olaf in disguises.",
//                    "HarperCollins", 2000, 10.69);
//
//            Book book13 = new Book("9780064408646", "The Ersatz Elevator (A Series of Unfortunate Events, #6))", "Lemony Snicket", "Mystery",
//                    "In the sixth novel, the Baudelaires are sent to live with the wealthy Esmé and Jerome Squalor. ",
//                    "HarperCollins", 2001, 10.99);
//
//            Book book14 = new Book("9780064408653", "The Vile Village (A Series of Unfortunate Events, #7))", "Lemony Snicket", "Mystery",
//                    "In the seventh novel, the Baudelaire orphans are taken into the care of a village, only to find rules, chores & evil seniors, as well as Count Olaf lurking nearby.",
//                    "HarperCollins", 2001, 12.49);
//
//            Book book15 = new Book("9780064408660", "The Hostile Hospital (A Series of Unfortunate Events, #8))", "Lemony Snicket", "Mystery",
//                    "In the eighth book, the Baudelaires are on run after being accused for murdering Count Olaf. They take refugee in a half-built hospital.",
//                    "HarperCollins", 2001, 12.49);
//
//            Book book16 = new Book("9780064410120", "The Carnivorous Carnival (A Series of Unfortunate Events #9))", "Lemony Snicket", "Mystery",
//                    "In the ninth book, the homeless Baudelaires arrive at the Carnival after fleeing from the Hospital. They attempt to find shelter & avoid capture by Count Olaf.",
//                    "HarperCollins", 2002, 12.49);
//
//            Book book17 = new Book("9780064410137", "The Slippery Slope (A Series of Unfortunate Events, #10))", "Lemony Snicket", "Mystery",
//                    "In the tenth book, the siblings go through freezing mountains. Violet & Klaus plan to rescue their baby sister, who had been captured by Count Olaf.",
//                    "HarperCollins", 2003, 11.69);
//
//            Book book18 = new Book("9780064410144", "The Grim Grotto (A Series of Unfortunate Events, #11))", "Lemony Snicket", "Mystery",
//                    "In the eleventh book, the Baudelaires discover the crew of the Queequeg submarine searching for a mysterious sugar bowl in the eponymous grotto.",
//                    "HarperCollins", 2004, 9.97);
//
//            Book book19 = new Book("9780064410151", "The Penultimate Peril (A Series of Unfortunate Events, #12))", "Lemony Snicket", "Mystery",
//                    "In the twelveth book, the Baudelaires are sent to work at Hotel Denouement to uncover which of the guests are working for the V.F.D. & which are working against them.",
//                    "HarperCollins", 2005, 10.07);
//
//            Book book20 = new Book("9780064410168", "The End (A Series of Unfortunate Events, #13))", "Lemony Snicket", "Mystery",
//                    "The End is the thirteenth and final novel in the children's novel series A Series of Unfortunate Events by Lemony Snicket.",
//                    "HarperCollins", 2006, 12.49);
//
//            Book book21 = new Book("9780439064866", "Harry Potter and the Chamber of Secrets", jkRowling, "Fantasy",
//                    "A mysterious elf tells Harry to expect trouble during his second year at Hogwarts, but nothing can prepare him for what's to come",
//                    "Scholastic", 1999, 14.16);
//
//            Book book22 = new Book("9780439136358", "Harry Potter and the Prisoner of Azkaban", jkRowling, "Fantasy",
//                    "In his third year at Hogwarts along with friends, Harry investigates Sirius Black, an escaped prisoner from Azkaban.",
//                    "Scholastic", 1999, 13.97);
//
//            Book book23 = new Book("9784048677608", "Sword Art Online 1: Aincrad", "Reki Kawaraha", "Science Fiction & Fantasy",
//                    "Sword Art Online a virtual reality game released, " +
//                            "but players quickly turns to horror as they discover that SAO is " +
//                            "a prison virtual world were game over means death.",
//                    "Yen Press", 2014, 13.00);
//            Book book24 = new Book("9781443455879", "The Midnight Library: A Novel", "Matt Haig", "Literature & Fiction.",
//                    "Somewhere in the universe there is a library that has an infinite number of books, " +
//                            "each one the story of another reality. One tells the story of your life as it is, " +
//                            "other books had another version with a different choice at any point in your life.",
//                    "Penguin Group", 2020, 20.40);
//            Book book25 = new Book("9780307739513", "Please Look After Mom (Vintage Contemporaries)", "Kyung-Sook Shin", "Literature & Fiction",
//                    "When So-nyo is separated from her husband in the Seoul subway station, her family begins a desperate search for her. " +
//                            "Yet secrets and sorrows begin to reveal themselves, they are forced to wonder: " +
//                            "how well did they know the woman they called Mom?",
//                    "Vintage", 2012, 13.99);
//            Book book26 = new Book("9780099514282", "Free Food for Millionaires", "Min Jin Lee", "Literature & Fiction",
//                    "Casey daughter of Korean immigrants is eager to make it on her own, away from her parents' tight-knit community, " +
//                            "but she soon finds that her economics degree isn't enough to rid her of ever-growing credit card debt and a toxic boyfriend. ",
//                    "Warner Books", 2018, 17.99);
//            Book book27 = new Book("9781646111497", "The Fascinating Animal Book for Kids: 500 Wild Facts! (Fascinating Facts)", "Ginjer Clarke", "Science, Nature & How It Works",
//                    "This animal encyclopedia includes 500 amazing animal facts that offer hours of engaging learning. Alongside full-color pictures on every page",
//                    "Callisto Media", 2020, 15.99);
//            Book book28 = new Book("9781626922358", " Mushoku Tensei: Jobless Reincarnation (Light Novel) Vol. 1", "Rifujin Na Magonote", " Literature & Fiction",
//                    "Kicked out by his family and wandering the streets, he hit rock-bottom--just as he’s killed by a speeding truck! " +
//                            "Awakening to find himself reborn in another world with the memories intact, " +
//                            "Rudeus Greyrat is determined not to repeat his past mistakes.",
//                    "Seven Seas Entertainment", 2019, 18.99);
//            Book book29 = new Book("9781718328808", "Seirei Gensouki: Spirit Chronicles: Omnibus 1", "Yuri Kitayama", "Fiction & Fantasy",
//                    "Rio has known nothing but solitude, hunger, and an overwhelming thirst for revenge. But from the humble beginnings of a poor orphan " +
//                            "comes a rebirth. Through his trials and tribulations, Rio’s prowess opens the door to an adventure spanning continents.",
//                    "J-Novel Club", 2021, 22.99);
//            Book book30 = new Book("9780316412896", "So I'm a Spider, So What?, Vol. 1 (light novel)", "Okina Baba", "Science Fiction & Fantasy",
//                    "I used to be a normal high school girl but in the blink of an eye, I woke up in a place I've never seen before and I was a spider?! " +
//                            "How could I possibly survive in literally the worst dungeon ever? Who the hell is responsible for this? SHOW YOUR FACE!",
//                    "Yen Press", 2017, 14.00);
//            Book book31 = new Book("9780316312295", "My Youth Romantic Comedy Is Wrong as I Expected, Vol. 1 - light novel", "Wataru Watari", "Graphic Novels & Romance",
//                    "Hachiman Hikigaya is a cynic. Youth is a crock, he believes--a sucker's game. But when he turns in an essay " +
//                            "for a school assignment espousing this view, he's make to work in the Service Club, " +
//                            "an organization helping students with problems in their lives!",
//                    "Yen On", 2016, 14.00);
//            Book book32 = new Book("9780786838653", "The Lightning Thief (Percy Jackson and the Olympians, Book 1)", "Rick Riordan", "Fairy Tales, Folk Tales & Myths",
//                    "Percy Jackson's pre-algebra teacher turned into a monster and tried to kill him. " +
//                            "When Percy's mom finds out, she sends Percy to Camp Half Blood, a summer camp for " +
//                            "demigods, where he learns that the father he never knew is Poseidon, god of the sea.",
//                    "Disney-Hyperion Books", 2006, 7.99);
//            Book book33 = new Book("9780141334011", "The Lost Hero (Heroes of Olympus, Book 1)", "Rick Riordan", "Fairy Tales, Folk Tales & Myths",
//                    "Jason has a problem. He doesn’t remember anything before waking up on a school bus holding hands with a girl. " +
//                            "Apparently she’s his girlfriend Piper, his best friend is a kid named Leo, and they’re all students in the Wilderness School.",
//                    "Disney-Hyperion Books", 2012, 9.99);
//            Book book34 = new Book("9781626927681", "Arifureta: From Commonplace to World's Strongest (Light Novel) Vol. 1", "Ryo Shirakome", "Ryo Shirakome",
//                    "Hajime life suddenly turned upside down when he, along with the rest of his class, is summoned to a fantasy world! " +
//                            "Hajime's job, Synergist, only has a single transmutation skill. Will he be able to survive in this dangerous world of monsters and demons?",
//                    "Seven Seas Entertainment", 2018, 23.75);
//            Book book35 = new Book("9780008402648", "The Christmas Killer: (DI James Walker series) (Book 1)", "Alex Pine", "Action & Adventure",
//                    "DI James Walker family Christmas is disturb when he opens a box on his doorstep. Inside is a promise – twelve days, twelve murders. " +
//                            "Not long after, the first body is found. Panic spreads through the remote Cumbrian village, there’s a killer amongst them.",
//                    "HarperCollins UK", 2021, 12.99);
//            Book book36 = new Book("9780802716743", "Ghosts of Spain: Travels Through Spain and Its Silent Past", "Giles Tremlett", "Non-fiction & Travel Literature",
//                    "Sixty years after the Spanish Civil War, victims of Franco's death squads broke what Spaniards call 'the pact of forgetting'. " +
//                            "Giles Tremlett embarked on a journey around the country to discover why some of Europe's most voluble people have kept silent.",
//                    "Bloomsbury USA", 2008, 20.00);
//            Book book37 = new Book("9781626927957", "Toradora! (Light Novel) Vol. 1", "Yuyuko Takemiya", "Literature & Fiction",
//                    "Takasu Ryuuji is a nice guy, but making friends when you've got an unintentionally scary face is tough. " +
//                            "Yet, Aisaka Taiga is beautiful, frightening, the girl known as the Palmtop Tiger is the one person in school even scarier than Ryuuji himself.",
//                    "Seven Seas", 2018, 13.99);
//            Book book38 = new Book("9781626921887", "Golden Time Vol. 1", "Yuyuko Takemiya", "Literature & Fiction",
//                    "College freshman Tada Banri is looking forward to a new life after losing his memories. Upon enrolling in Tokyo law school, " +
//                            "this new direction in Banri’s life stops short when he happens across a person from his past during the school’s opening ceremony.",
//                    "Seven Seas", 2015, 24.42);
//            Book book39 = new Book("9781626926585", "Grimgar of Fantasy and Ash (Light Novel) Vol. 1", "Ao Jyumonji", "Literature & Fiction",
//                    "Haruhiro awakens among a group of strangers who can only remember their own names. When they make it into the light, they discover Grimgar. " +
//                            "Only by cooperating, and learning new skills can they hope to survive in this dangerous land of monsters.",
//                    "Seven Seas", 2017, 13.99);
//            Book book40 = new Book("9780316339155", "Is It Wrong to Try to Pick Up Girls in a Dungeon?, Vol. 1 - light novel", "Fujino Omori", "Science Fiction & Fantasy",
//                    "Is it wrong to face the perils of Dungeon alone? Maybe. Is it wrong to dream of playing hero to maidens in Dungeon? Maybe not. " +
//                            "Bell discovers that anything can happen in the labyrinth. The only problem? He's the one who winds up the damsel in distress!",
//                    "Yen Press", 2014, 14.00);
//            Book book41 = new Book("9783842025738", "The Rising of the Shield Hero Volume 1", "Aneko Yusagi", "World Literature & Fiction",
//                    "Naofumi suddenly finds himself summoned to a parallel universe! He discovers he is one of four heroes tasked with saving the world " +
//                            "from its prophesied destruction as the Shield Hero. Naofumi is soon alone, penniless, and betrayed with no one to turn to.",
//                    "One Peace Books", 2015, 12.95);
//            Book book42 = new Book("9780316553377", "Konosuba: God's Blessing on This Wonderful World!, Vol. 1: Oh! My Useless Goddess!", "Natsume Akatsuki", "Science Fiction & Fantasy",
//                    "After dying Kazuma opens his eyes to see a goddess that offers him a chance to be in a parallel world. " +
//                            "The catch is that the world is violent by a growing evil! Fortunately, he can choose any one thing to bring with him." +
//                            " So he chooses the goddess, Aqua!",
//                    "Yen On", 2017, 14.00);

            repository.saveAll(
                            List.of(book1, book2, book3, book4, book5, book6, book7
//                                    , book8 ,book9, book10
//                                    , book11, book12, book13, book14, book15, book16, book17, book18, book19
//                                    , book20, book21, book22, book23, book24, book25, book26, book27, book28
//                                    , book29, book30, book31, book32, book33, book34, book35, book36, book37
//                                    , book38, book39, book40, book41, book42
                            )
            );
        };
    };
}
