PGDMP                         {            project    15.3    15.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16397    project    DATABASE     �   CREATE DATABASE project WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE project;
                postgres    false            �            1259    16398    document    TABLE     �   CREATE TABLE public.document (
    dno integer NOT NULL,
    photo text,
    nid_card text,
    police_verification text,
    flatno integer
);
    DROP TABLE public.document;
       public         heap    postgres    false            �            1259    16403    document_dno_seq    SEQUENCE     �   CREATE SEQUENCE public.document_dno_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.document_dno_seq;
       public          postgres    false    214                       0    0    document_dno_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.document_dno_seq OWNED BY public.document.dno;
          public          postgres    false    215            �            1259    16404    register    TABLE     {   CREATE TABLE public.register (
    username character varying(20) NOT NULL,
    password character varying(20) NOT NULL
);
    DROP TABLE public.register;
       public         heap    postgres    false            �            1259    16407    rent    TABLE       CREATE TABLE public.rent (
    rno integer NOT NULL,
    month character varying(12) NOT NULL,
    rent integer NOT NULL,
    gas_bill integer NOT NULL,
    maintanance integer NOT NULL,
    payable_amount integer NOT NULL,
    flatno integer,
    date date
);
    DROP TABLE public.rent;
       public         heap    postgres    false            �            1259    16410    tenent    TABLE     �  CREATE TABLE public.tenent (
    flatno integer NOT NULL,
    name character varying(20) NOT NULL,
    gender character varying(10) NOT NULL,
    no_of_members integer NOT NULL,
    contact_no numeric(11,0) NOT NULL,
    address character varying(100) NOT NULL,
    nid_no numeric(12,0) NOT NULL,
    passport_no character varying(10) NOT NULL,
    months_started character varying(12) NOT NULL
);
    DROP TABLE public.tenent;
       public         heap    postgres    false            q           2604    16467    document dno    DEFAULT     l   ALTER TABLE ONLY public.document ALTER COLUMN dno SET DEFAULT nextval('public.document_dno_seq'::regclass);
 ;   ALTER TABLE public.document ALTER COLUMN dno DROP DEFAULT;
       public          postgres    false    215    214            
          0    16398    document 
   TABLE DATA           U   COPY public.document (dno, photo, nid_card, police_verification, flatno) FROM stdin;
    public          postgres    false    214                    0    16404    register 
   TABLE DATA           6   COPY public.register (username, password) FROM stdin;
    public          postgres    false    216   }                 0    16407    rent 
   TABLE DATA           e   COPY public.rent (rno, month, rent, gas_bill, maintanance, payable_amount, flatno, date) FROM stdin;
    public          postgres    false    217   �                 0    16410    tenent 
   TABLE DATA              COPY public.tenent (flatno, name, gender, no_of_members, contact_no, address, nid_no, passport_no, months_started) FROM stdin;
    public          postgres    false    218   9                  0    0    document_dno_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.document_dno_seq', 22, true);
          public          postgres    false    215            s           2606    16415    document document_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.document
    ADD CONSTRAINT document_pkey PRIMARY KEY (dno);
 @   ALTER TABLE ONLY public.document DROP CONSTRAINT document_pkey;
       public            postgres    false    214            u           2606    16417    register register_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.register
    ADD CONSTRAINT register_pkey PRIMARY KEY (username);
 @   ALTER TABLE ONLY public.register DROP CONSTRAINT register_pkey;
       public            postgres    false    216            w           2606    16419    rent rent_pkey 
   CONSTRAINT     M   ALTER TABLE ONLY public.rent
    ADD CONSTRAINT rent_pkey PRIMARY KEY (rno);
 8   ALTER TABLE ONLY public.rent DROP CONSTRAINT rent_pkey;
       public            postgres    false    217            y           2606    16421    tenent tenent_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.tenent
    ADD CONSTRAINT tenent_pkey PRIMARY KEY (flatno);
 <   ALTER TABLE ONLY public.tenent DROP CONSTRAINT tenent_pkey;
       public            postgres    false    218            z           2606    16422    document document_flatno_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.document
    ADD CONSTRAINT document_flatno_fkey FOREIGN KEY (flatno) REFERENCES public.tenent(flatno) ON UPDATE SET NULL ON DELETE CASCADE;
 G   ALTER TABLE ONLY public.document DROP CONSTRAINT document_flatno_fkey;
       public          postgres    false    214    3193    218            {           2606    16427    rent rent_flatno_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.rent
    ADD CONSTRAINT rent_flatno_fkey FOREIGN KEY (flatno) REFERENCES public.tenent(flatno) ON UPDATE SET NULL ON DELETE CASCADE;
 ?   ALTER TABLE ONLY public.rent DROP CONSTRAINT rent_flatno_fkey;
       public          postgres    false    3193    217    218            
   k   x�3��LIKKO�LLI�,NK�̸�898H��F\F���V11�ũE�11��E�i11.�ɥ��y%@!Ǣ��̼�����Ԓ����<#�D4�P�N����� =0P         B   x���24261��\���)�9P^Pb
�U��X���p9%V�B�Sr3�8�$Wb1H�+F��� �R         Z   x�3�t,(���4400�44�� �1�4�4202�50�54�2�t,M/-.�*5�`�D�A�Z�r�p�&VBe�f�I#�BK�=... ��>         �   x�M�K�0Dד� ��N�V�r6F��ЂT`��~��-y��cl�����`��� �g^�Z/�c�55��k'Xv6�@�Lz�_��v��3
��5��m�tL�8?�fY�8D���W%ж�?!���g�\P��rC�!��*����eʸо��`��L�eT�:�9�������Hp     