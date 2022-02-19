package com.example.demo.book;

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
            //add books by declaring their ISBN, title, author, genre, descrption,
            //publisher, year of publication, and price in that order
            Book book1 = new Book("0747532699", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy",
                        "Harry Potter and the Sorcerer's Stone is an enthralling start to\n" +
                        "  Harry's journey toward coming to terms with his past and facing his future.",
                        "Bloomsbury", 1997, 12.99);
            Book book2 = new Book("0261103342", "The Hobbit", "J.R.R. Tolkien", "High fantasy",
                    "The critically acclaimed novel that kickstarted " +
                            "the famous Middle Earth novels by J.R.R. Tolkien.",
                    "Harper Collins", 1937, 14.99);
            Book book3 = new Book("0670813028", "It", "Stephen King", "Horror",
                    "One of Stephen King's most prolific novels, starring the iconic clown character, " +
                            "Pennywise.", "Viking", 1986, 20.99);
            Book book4 = new Book("0627396393", "Sword Art Online 1: Aincrad", "Reki Kawaraha", "Science Fiction & Fantasy", 
                                  "In the year 2022, gamers rejoice as Sword Art Online a virtual reality game released." +
                                  "But when the game goes live, the elation of the players quickly turns to horror as they discover that SAO is missing" +
                                  "one of the most basic functions of any MMORPG - a log-out button. Now trapped in the virtual world users are issued a chilling ultimatum:" +
                                  "conquer all one hundred floors of Aincrad to regain your freedom. But in the warped world of SAO, game over means certain death.", 
                                  "Yen Press", 2014, 13.00);
            Book book5 = new Book("0548588623", "The Midnight Library: A Novel", "Matt Haig", "Literature & Fiction.", 
                                  "Somewhere out beyond the edge of the universe there is a library that contains an infinite number of books," +
                                  "each one the story of another reality. One tells the story of your life as it is, along with another book for the" +
                                  "other life you could have lived if you had made a different choice at any point in your life. While we all wonder how our lives" +
                                  "might have been, what if you had the chance to go to the library and see for yourself? Would any of these other lives truly be better? ", 
                                  "Penguin Group", 2020, 20.40); 
            Book book6 = new Book("0296165408", "Please Look After Mom (Vintage Contemporaries)", "Kyung-Sook Shin", "Literature & Fiction", 
                                  "When sixty-nine-year-old So-nyo is separated from her husband among the crowds of the Seoul subway station, her family begins" + 
                                  "a desperate search to find her. Yet as long-held secrets and private sorrows begin to reveal themselves, they are forced to wonder:" +
                                  "how well did they actually know the woman they called Mom?", 
                                  "Vintage", 2012, 13.99);
            Book book7 = new Book("0725294207", "Free Food for Millionaires", "Min Jin Lee", "Literature & Fiction",  
                                  "Meet Casey Han: a strong-willed, Queens-bred daughter of Korean immigrants immersed in a glamorous Manhattan lifestyle she can't afford." +
                                  "Casey is eager to make it on her own, away from the judgements of her parents' tight-knit community, but she soon finds that her Princeton" +
                                  "economics degree isn't enough to rid her of ever-growing credit card debt and a toxic boyfriend. When a chance encounter with an old friend lands" +
                                  "her a new opportunity, she's determined to carve a space for herself in a glittering world of privilege, power, and wealth-but at what cost?",
                                  "Warner Books", 2018, 17.99);
            Book book8 = new Book("0589181364", "The Fascinating Animal Book for Kids: 500 Wild Facts! (Fascinating Facts)", "Ginjer Clarke", "Science, Nature & How It Works", 
                                  "This animal encyclopedia includes 500 amazing animal facts that offer hours of engaging learning. Alongside full-color pictures on every page",
                                  "Callisto Media", 2020, 15.99);
            Book book9 = new Book("0063049341", " Mushoku Tensei: Jobless Reincarnation (Light Novel) Vol. 1", "Rifujin Na Magonote", " Literature & Fiction",
                                   "Kicked out by his family and wandering the streets, an unemployed 34-year-old shut-in thinks he’s hit rock-bottom--just as he’s hit and killed by a speeding truck!" + 
                                  "Awakening to find himself reborn as an infant in a world of swords and sorcery, but with the memories of his first life intact, Rudeus Greyrat is determined" +
                                  "not to repeat his past mistakes. He’s going to make the most of this reincarnation as he sets off on the adventure of a second lifetime",
                                  "Seven Seas Entertainment", 2019, 18.99);                         
            Book book10 = new Book("0225285168", "Seirei Gensouki: Spirit Chronicles: Omnibus 1", "Yuri Kitayama", "Fiction & Fantasy", 
                                   "Rio has known nothing but solitude, hunger, and an overwhelming thirst for revenge. But from the humble beginnings of a poor orphan" +
                                   "comes a rebirth that turns the Galarc Kingdom on its head. Through his trials and tribulations, Rio’s prowess opens the door to" +
                                   "an adventure spanning continents, international incidents, love triangles―even an assassination attempt by an adorable werefox girl.",
                                   "J-Novel Club", 2021, 22.99);            
            Book book11 = new Book("0225285168", "So I'm a Spider, So What?, Vol. 1 (light novel)", "Okina Baba", "Science Fiction & Fantasy",
                                   "I used to be a normal high school girl but in the blink of an eye, I woke up in a place I've never seen before and-and I was reborn as a spider?!" +
                                   "How could something that's nothing more than a tiny spider (that's me) possibly survive in literally the worst dungeon ever? Are there no rules?" +
                                   "There should be some rules! Who the hell is responsible for this? SHOW YOUR FACE!",
                                   "Yen Press", 2017, 14.00);                               
            Book book12 = new Book("0225285168", "My Youth Romantic Comedy Is Wrong as I Expected, Vol. 1 - light novel", "Wataru Watari", "Graphic Novels & Romance", 
                                   "9.	Hachiman Hikigaya is a cynic. Youth is a crock, he believes--a sucker's game, an illusion woven from failure and hypocrisy. But when he turns in an essay" +
                                   "for a school assignment espousing this view, he's sentenced to work in the Service Club, an organization dedicated to helping students with problems in their lives!" +
                                   "How will Hachiman the Cynic cope with a job that requires--gasp!--optimism?",
                                   "Yen On", 2016, 14.00);                       
            Book book13 = new Book("0225285168", "The Lightning Thief (Percy Jackson and the Olympians, Book 1)", "Rick Riordan", "Fairy Tales, Folk Tales & Myths",
                                   "10.	Percy Jackson is a good kid, but he can't seem to focus on his schoolwork or control his temper. And lately, being away at boarding school is only" +
                                   "getting worse--Percy could have sworn his pre-algebra teacher turned into a monster and tried to kill him. When Percy's mom finds out, she knows it's time that" +
                                   "he knew the truth about where he came from, and that he go to the one place he'll be safe. She sends Percy to Camp Half Blood, a summer camp for" + 
                                   "demigods (on Long Island), where he learns that the father he never knew is Poseidon, god of the sea.",
                                   "Disney-Hyperion Books", 2006, 7.99);                                 
            Book book13 = new Book("0225285168", "The Lost Hero (Heroes of Olympus, Book 1)", "Rick Riordan", "Fairy Tales, Folk Tales & Myths",
                                   "11.	Jason has a problem. He doesn’t remember anything before waking up on a school bus holding hands with a girl. Apparently she’s his girlfriend Piper," +
                                   "his best friend is a kid named Leo, and they’re all students in the Wilderness School, a boarding school for “bad kids.” What he did to end up here," +
                                   "Jason has no idea―except that everything seems very wrong.", 2012, 9.99);
                                   "Disney-Hyperion Books",                          
            repository.saveAll(
                    List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, 
                           book14, book15, book16, book17, book18, book19, book20, book21, book22, book23)
            );
        };
    };
}
