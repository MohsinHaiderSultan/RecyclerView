package com.example.globalgaz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val adapter = ArticlesAdapter(getArticles())
        recyclerview.adapter = adapter
    }

    fun getArticles(): List<Article> {
        val articles = ArrayList<Article>()


        articles.add(
            Article(
                "1. Gilgit",
                "Date 1, 2024",
                R.drawable.image1,
                "Gilgit is a gateway to the mountainous region of Northern Pakistan, known for its natural beauty, crystal-clear rivers, and towering peaks. A paradise for trekkers and adventure lovers."
            )
        )

        articles.add(
            Article(
                "2. Baltistan",
                "Date 2, 2024",
                R.drawable.image2,
                "Baltistan, home to the mighty Karakoram range, is known for its stunning landscapes and unique culture. It is a remote but enchanting destination, ideal for travelers seeking solitude and natural beauty."
            )
        )

        articles.add(
            Article(
                "3. Astore",
                "Date 3, 2024",
                R.drawable.image3,
                "Astore is a valley surrounded by towering mountains and lush green meadows, making it one of the most scenic places in Northern Pakistan. It's a perfect spot for trekking, camping, and nature exploration."
            )
        )

        articles.add(
            Article(
                "4. Paris",
                "Date 4, 2024",
                R.drawable.image4,
                "One of the dream-come-true and most artistic places to visit in the world is none other than Paris. Everything around Paris is amusing, lovely, and fascinating, making it one of the best places for a honeymoon."
            )
        )


        articles.add(
            Article(
                "5. Tokyo",
                "Date 5, 2024",
                R.drawable.image5,
                "A city where tradition meets technology, Tokyo is a fast-paced metropolis full of futuristic skyscrapers, ancient temples, and mouth-watering cuisine. It's a must-visit for travelers seeking cultural fusion."
            )
        )

        articles.add(
            Article(
                "6. Maldives",
                "Date 6, 2024",
                R.drawable.image6,
                "The Maldives, with its crystal-clear waters and white sandy beaches, is a tropical paradise perfect for honeymooners and beach lovers. It's a luxury destination where you can unwind and enjoy aquatic activities."
            )
        )

        articles.add(
            Article(
                "7. New York City",
                "Date 7, 2024",
                R.drawable.image7,
                "New York City, the city that never sleeps, is a hub of cultural diversity, iconic landmarks like the Statue of Liberty, and a buzzing arts scene. Whether it's Broadway shows or Central Park, there's always something exciting to do."
            )
        )

        articles.add(
            Article(
                "8. Sydney",
                "Date 8, 2024",
                R.drawable.image8,
                "Sydney, Australia’s largest city, is famous for its stunning harborfront with the iconic Sydney Opera House and Harbour Bridge. A perfect blend of urban life, beaches, and adventure activities awaits here."
            )
        )

        articles.add(
            Article(
                "9. Rome",
                "Date 9, 2024",
                R.drawable.image9,
                "Rome, the eternal city, is a treasure trove of history and culture. From the Colosseum to the Vatican, every corner tells a story from the ancient world. It's a destination that offers a walk through time."
            )
        )

        articles.add(
            Article(
                "10. Dubai",
                "Date 10, 2024",
                R.drawable.image10,
                "Dubai, known for its futuristic architecture, luxury shopping, and vibrant nightlife, is a city where the impossible becomes possible. From desert safaris to sky-high experiences, it’s a destination that surprises every visitor."
            )
        )

        articles.add(
            Article(
                "11. London",
                "Date 11, 2024",
                R.drawable.image11,
                "London, a city steeped in history, is famous for its landmarks like Big Ben, the Tower of London, and Buckingham Palace. A melting pot of cultures, it's a vibrant metropolis where tradition meets modernity."
            )
        )

        articles.add(
            Article(
                "12. Santorini",
                "Date 12, 2024",
                R.drawable.image12,
                "Santorini, with its white-washed buildings and blue domes overlooking the Aegean Sea, is a postcard-perfect destination. Famous for its sunsets, it’s a must-visit for anyone looking for a romantic escape."
            )
        )

        articles.add(
            Article(
                "13. Bali",
                "Date 13, 2024",
                R.drawable.image13,
                "Bali, the Island of the Gods, offers a mix of spiritual and natural wonders. From serene temples to lush green rice terraces, it's a haven for those seeking peace, adventure, or cultural immersion."
            )
        )

        articles.add(
            Article(
                "14. Istanbul",
                "Date 14, 2024",
                R.drawable.image14,
                "Istanbul, where East meets West, is a city of contrasts with a rich history. From the Hagia Sophia to the bustling Grand Bazaar, it offers a unique blend of culture, food, and architectural wonders."
            )
        )

        articles.add(
            Article(
                "15. Cairo",
                "Date 15, 2024",
                R.drawable.image15,
                "Cairo, home to the Great Pyramids of Giza, is a city that takes you back in time to the era of the Pharaohs. The bustling streets and ancient monuments make it a destination full of mystery and history."
            )
        )

        articles.add(
            Article(
                "16. Zurich",
                "Date 16, 2024",
                R.drawable.image16,
                "Zurich, Switzerland’s financial capital, is surrounded by picturesque mountains and lakes. It’s a perfect blend of natural beauty and modernity, offering world-class museums, high-end shopping, and outdoor activities."
            )
        )

        articles.add(
            Article(
                "17. Kyoto",
                "Date 17, 2024",
                R.drawable.image17,
                "Kyoto, Japan’s cultural heart, is famous for its traditional wooden houses, stunning temples, and beautiful gardens. It's a place where you can experience Japan's rich history and spiritual beauty."
            )
        )

        articles.add(
            Article(
                "18. Marrakech",
                "Date 18, 2024",
                R.drawable.image18,
                "Marrakech, a city of vibrant colors and bustling markets, is a sensory experience. From the aromatic spices to the stunning palaces, it's a destination that immerses you in Moroccan culture and history."
            )
        )

        articles.add(
            Article(
                "19. Reykjavik",
                "Date 19, 2024",
                R.drawable.image19,
                "Reykjavik, the capital of Iceland, is known for its stunning landscapes and proximity to natural wonders like geysers and volcanoes. It’s the perfect destination for adventurers and nature lovers alike."
            )
        )

        articles.add(
            Article(
                "20. Barcelona",
                "Date 20, 2024",
                R.drawable.image20,
                "Barcelona, Spain’s artistic hub, is renowned for its unique architecture, like Gaudi’s Sagrada Familia, and its Mediterranean vibe. It’s a lively city with a rich history, beautiful beaches, and a world-class culinary scene."
            )
        )

        return articles
    }

}