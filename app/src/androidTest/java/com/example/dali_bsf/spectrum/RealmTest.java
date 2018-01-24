package com.example.dali_bsf.spectrum;

import android.support.test.runner.AndroidJUnit4;

import com.example.dali_bsf.spectrum.data.Repostry.IEnfantRepository;
import com.example.dali_bsf.spectrum.data.Repostry.IParentRepository;
import com.example.dali_bsf.spectrum.data.Repostry.ParentRepository;
import com.example.dali_bsf.spectrum.data.model.Enfant;
import com.example.dali_bsf.spectrum.data.model.Parent;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

import java.io.File;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by khalil on 15/01/2018.
 */

@RunWith(AndroidJUnit4.class)
public class RealmTest extends TestCase {
    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder();
    private Realm realmMock;

    @Before
    public void setUp()throws Exception{
        File tempFolder = testFolder.newFolder("realmdata");
        RealmConfiguration config = new RealmConfiguration.Builder(tempFolder).build();
        realmMock = Realm.getInstance(config);

        Enfant enfant1 = new Enfant();
        enfant1.setSexe("H");
        enfant1.setLogin("khalil");
        Enfant enfant2 =new Enfant();
        enfant2.setSexe("F");
        enfant2.setLogin("jamila");
        Parent parent =new Parent();
        parent.setPassword("abc123");

        IParentRepository repo =new ParentRepository();
    }

    @Test
    public void insertPersonne(){

    }

}
